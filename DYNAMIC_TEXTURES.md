# Dynamic crafting table textures

Vanilla and automatically discovered modded wood variants generate their textures
on the client during block atlas loading. No per-wood PNGs are needed. Existing
vanilla table IDs and recipe IDs are preserved. Vanilla and modded woods share
one registration pipeline and one runtime asset/data generator. Minecraft's existing
oak crafting table is reused; its name and oak-only recipe are supplied at runtime.
There is no hard-coded vanilla registration class, datagen entrypoint, or
`src/main/generated` resource tree.

## Automatic registration

Fabric's `RegistryEntryAddedCallback.allEntries` processes existing block items
and listens for other mods registering additional ones. A companion block callback
handles items registered before their block. Creation is guarded against recursive
callbacks and duplicates, and the published catalogue stays sorted by stable ID.
The mod recognizes
blocks declared in mods' `minecraft:planks` block or item tags (including nested
tags and optional entries), plus block IDs ending in `_planks`, `/planks`, or
named `planks`. Slabs and stairs are not discovered merely because their names
contain `planks`. Blocks without an inventory item are skipped.

Discovery reads tags shipped at the top-level `data/` path of installed mods.
It does not use world datapacks or client resource packs to decide which blocks
exist: those load after registry freeze and could differ between client and
server. A block with an unusual name must be declared in a shipped plank tag.
Conditional tag declarations are considered candidates only if their block/item
is actually registered. Shipped declarations are combined for discovery rather
than applying world-specific tag replacement or removal rules.

Every discovered wood receives a normal crafting-table block and block item,
a creative-tab entry, a 2x2 recipe using that plank's actual item ID, a recipe
unlock advancement, a self-drop loot table, crafting-table tags, models, and an
English fallback name. Tables inherit the source plank item's cooking fuel
component, including its burn time and speed multiplier, through Fabric's
`DefaultItemComponentEvents.MODIFY` event after the default callback phase.
This also inherits source fuel edits made by other mods in that phase.
Planks with no fuel component produce tables
with no fuel component. A shipped `minecraft:non_flammable_wood` item tag also
forces the table to be non-fuel; that tag is propagated too.
Placed tables inherit their source plank's lava-ignition flag and fire ignition/
burn odds. Fire odds are refreshed after default-phase tag callbacks on both sides, so tag-backed
mod flammability entries are supported. Crimson, warped, and modded lava-safe
planks produce lava-safe tables. This does not make dropped items immune to lava.
The generated server data and client assets live in an in-memory pack above
vanilla defaults and below mod/user packs. This replaces vanilla's generic-plank
crafting-table recipe with an oak-only recipe while permitting explicit overrides.
All models, blockstates, item definitions, English fallback names, recipes,
advancements, drops, crafting-table/workbench/axe/non-flammable tags, and the
conversion recipe back to the oak table are generated on resource loading.
No datagen task or generated JSON files are needed for any wood.

The creative tab sorts all tables together by their displayed names, regardless
of source mod, including the existing oak table. Inventory tooltips show the
plank provider's mod name directly beneath the item name in grey italics. The
name comes from Fabric Loader's mod metadata, falling back to the plank namespace
when no matching mod ID exists. Vanilla woods display Minecraft.

Modded table IDs retain the full plank ID, for example:

```
example:fir_planks -> variantcraftingtables:mod/example/fir_planks_crafting_table
```

The catalogue is sorted and IDs do not depend on which mod initialized first.
Numeric registration order follows registry events; Fabric handles ID synchronization.
Startup logs include one line per source namespace listing all wood names
(without the `_planks` suffix), followed by a total including the existing oak table.
Full source and generated IDs are logged at DEBUG level.
The completed summary is logged once when the client starts or a dedicated server starts.
Clients and servers need the same wood-providing mods; standard Fabric registry
synchronization handles numeric IDs. Installing or removing wood mods requires
a restart. Adding another wood to a supported Minecraft/mod setup does not need
a new release of Variant Crafting Tables.

## How generation works

`CraftingTableSpriteSource` is registered through Fabric's `SpriteSourceRegistry`
and included in `assets/minecraft/atlases/blocks.json`. Each resource reload
creates fresh sprites; rendering uses the normal stitched atlas afterwards.
Dedicated servers do not load the client entrypoint.

Crafting screens use the vanilla title and layout without a client screen mixin.
Item names and tooltips keep the complete wood-specific table name.
On the server a small `CraftingMenu` subclass checks the actual table block and
normal player interaction range. It retains vanilla's menu type and client screen;
vanilla menus and other mods' menus are not globally modified.
Only the in-memory resource-pack injection still uses a custom mixin.

The compositor derives a reusable wood mask from Minecraft's built-in oak plank
palette and crafting table faces. Pixels matching that palette (with a small
tolerance for the exposed wood on the top) are replaced with the corresponding
pixels of the selected plank texture. Tools, outlines, and the leather crafting
grid are retained. This deliberately uses the vanilla decoration layout rather
than trying to infer decorations from arbitrary resource-pack crafting tables.
No separately authored transparent template is required.

Plank textures come from the active resource packs. The resolver follows the
plank's blockstate and standard JSON model parents, including `#texture`
references, with a conventional `textures/block/<block path>.png` fallback.
For stateful or multipart planks it uses the first declared variant/application.
The original plank resolution,
animation sheet, and metadata are retained, with the decoration repeated in
each animation frame. Invalid inputs log a warning and fall back to the vanilla
crafting table face.

Before constructing a table, registration checks its block/item IDs for conflicts
and checks that its recipe ingredient is registered and is not air. The block
and item are both constructed before either is registered. If reading a source
plank's lava, fire, or fuel behaviour throws a runtime exception, a warning names
the source and the corresponding table behaviour defaults to no lava ignition,
no burning, or no fuel. These fallbacks retain the table and its generated
resources, so a failed property read does not change the registered catalogue.
Construction and registry failures still stop loading with the source plank,
table ID, and failing stage: intrusive holders and registry callbacks can mutate
state before throwing, and skipping at that point cannot safely undo the changes.

## Resource pack overrides

Packs can replace any generated face by supplying the original texture path:

```
assets/variantcraftingtables/textures/block/birch_crafting_table_front.png
assets/variantcraftingtables/textures/block/birch_crafting_table_side.png
assets/variantcraftingtables/textures/block/birch_crafting_table_top.png
```

Each supplied face takes precedence over generation. Changing resource packs
or reloading resources regenerates the remaining faces from the current planks.
Custom tinting, custom model loaders/renderers, and models whose different faces
require different wood textures are not reproduced. Standard JSON models and
resource-pack texture redirections are supported. The generated table bottom
uses the resolved plank sprite as well.

## Verification

Run `gradlew build` to build the production mod. Local test sources, test mods,
and server files are intentionally excluded from Git. When the local test sources
are present, the build also runs server game tests and texture/resource checks;
`gradlew verifyDynamicTextures` runs just the latter. The texture checks use
Minecraft's actual assets for all 36 vanilla faces, preserved decorations,
high-resolution animation frames, transparency, and invalid frame dimensions.
Resource checks cover generated assets/data, unique IDs, inherited plank textures,
and pack overrides, for both vanilla and modded woods. Server tests check legacy
vanilla IDs, every variant's crafting recipe and self-drop, conversion to oak,
and vanilla nether-wood fuel behavior. Further checks cover item-before-block
registration, duplicate prevention, all runtime client assets, and menu distance/
block removal. Failure checks include deliberately unreadable lava and fuel
properties, usable recipes for fallback tables, and an occupied item ID without
an orphan block. The isolated game-test mod registers fixture woods after
the main mod, covering nested block/item tags, different block/item IDs, identical
wood names in different namespaces, non-flammable wood, recipes, drops, and tags.
Fixtures are excluded from the distributable jar and normal game runs.

For optional real-mod tests, put Fabric mod jars and their dependencies in
`test-mods/`; see `test-mods/README.md`. They are loaded only for game tests and
headless image checks, never bundled with the mod. The project supplies Fabric API
and ignores duplicate `fabric-api-*.jar` files in that folder. Run
`gradlew build -PexternalModTests=false` for fixture-only verification.

For visual verification, place each table, check its inventory icon, then change
a plank texture with a resource pack and reload with F3+T. Also check a pack
supplying an explicit table face override.
