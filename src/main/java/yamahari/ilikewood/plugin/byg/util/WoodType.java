package yamahari.ilikewood.plugin.byg.util;

import yamahari.ilikewood.registry.objecttype.WoodenBlockType;
import yamahari.ilikewood.registry.objecttype.WoodenItemType;
import yamahari.ilikewood.registry.objecttype.WoodenTieredItemType;
import yamahari.ilikewood.registry.woodtype.DefaultWoodType;
import yamahari.ilikewood.registry.woodtype.IWoodType;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WoodType implements IWoodType {
    private static final Set<WoodenBlockType> BLOCK_TYPES_WITH_STRIPPED_LOG = createBlockTypesWithStrippedLog();
    private static final Set<WoodenBlockType> BLOCK_TYPES_WITHOUT_STRIPPED_LOG = createBlockTypesWithoutStrippedLog();
    private static final Set<WoodenBlockType> BUILTIN_BLOCK_TYPES = createBuiltinBlockTypesSet();

    private final String name;
    private final Set<WoodenBlockType> blockTypes;

    public WoodType(final String name, final boolean hasStrippedLog) {
        this.name = name;
        this.blockTypes = hasStrippedLog ? BLOCK_TYPES_WITH_STRIPPED_LOG : BLOCK_TYPES_WITHOUT_STRIPPED_LOG;
    }

    private static Set<WoodenBlockType> createBlockTypesWithStrippedLog() {
        final Set<WoodenBlockType> blockTypes = new HashSet<>();
        blockTypes.add(WoodenBlockType.PANELS);
        blockTypes.add(WoodenBlockType.PANELS_STAIRS);
        blockTypes.add(WoodenBlockType.PANELS_SLAB);
        blockTypes.add(WoodenBlockType.BARREL);
        blockTypes.add(WoodenBlockType.WHITE_BED);
        blockTypes.add(WoodenBlockType.ORANGE_BED);
        blockTypes.add(WoodenBlockType.MAGENTA_BED);
        blockTypes.add(WoodenBlockType.LIGHT_BLUE_BED);
        blockTypes.add(WoodenBlockType.YELLOW_BED);
        blockTypes.add(WoodenBlockType.LIME_BED);
        blockTypes.add(WoodenBlockType.PINK_BED);
        blockTypes.add(WoodenBlockType.GRAY_BED);
        blockTypes.add(WoodenBlockType.LIGHT_GRAY_BED);
        blockTypes.add(WoodenBlockType.CYAN_BED);
        blockTypes.add(WoodenBlockType.PURPLE_BED);
        blockTypes.add(WoodenBlockType.BLUE_BED);
        blockTypes.add(WoodenBlockType.BROWN_BED);
        blockTypes.add(WoodenBlockType.GREEN_BED);
        blockTypes.add(WoodenBlockType.RED_BED);
        blockTypes.add(WoodenBlockType.BLACK_BED);
        blockTypes.add(WoodenBlockType.COMPOSTER);
        blockTypes.add(WoodenBlockType.CHEST);
        blockTypes.add(WoodenBlockType.SAWMILL);
        blockTypes.add(WoodenBlockType.LECTERN);
        blockTypes.add(WoodenBlockType.LADDER);
        blockTypes.add(WoodenBlockType.SCAFFOLDING);
        blockTypes.add(WoodenBlockType.SOUL_TORCH);
        blockTypes.add(WoodenBlockType.TORCH);
        blockTypes.add(WoodenBlockType.WALL_TORCH);
        blockTypes.add(WoodenBlockType.WALL_SOUL_TORCH);

        blockTypes.add(WoodenBlockType.POST);
        blockTypes.add(WoodenBlockType.STRIPPED_POST);
        blockTypes.add(WoodenBlockType.WALL);

        return Collections.unmodifiableSet(blockTypes);
    }

    private static Set<WoodenBlockType> createBlockTypesWithoutStrippedLog() {
        final Set<WoodenBlockType> blockTypes = new HashSet<>();
        blockTypes.add(WoodenBlockType.PANELS);
        blockTypes.add(WoodenBlockType.PANELS_STAIRS);
        blockTypes.add(WoodenBlockType.PANELS_SLAB);
        blockTypes.add(WoodenBlockType.BARREL);
        blockTypes.add(WoodenBlockType.WHITE_BED);
        blockTypes.add(WoodenBlockType.ORANGE_BED);
        blockTypes.add(WoodenBlockType.MAGENTA_BED);
        blockTypes.add(WoodenBlockType.LIGHT_BLUE_BED);
        blockTypes.add(WoodenBlockType.YELLOW_BED);
        blockTypes.add(WoodenBlockType.LIME_BED);
        blockTypes.add(WoodenBlockType.PINK_BED);
        blockTypes.add(WoodenBlockType.GRAY_BED);
        blockTypes.add(WoodenBlockType.LIGHT_GRAY_BED);
        blockTypes.add(WoodenBlockType.CYAN_BED);
        blockTypes.add(WoodenBlockType.PURPLE_BED);
        blockTypes.add(WoodenBlockType.BLUE_BED);
        blockTypes.add(WoodenBlockType.BROWN_BED);
        blockTypes.add(WoodenBlockType.GREEN_BED);
        blockTypes.add(WoodenBlockType.RED_BED);
        blockTypes.add(WoodenBlockType.BLACK_BED);
        blockTypes.add(WoodenBlockType.COMPOSTER);
        blockTypes.add(WoodenBlockType.CHEST);
        blockTypes.add(WoodenBlockType.LECTERN);
        blockTypes.add(WoodenBlockType.LADDER);
        blockTypes.add(WoodenBlockType.SCAFFOLDING);
        blockTypes.add(WoodenBlockType.SOUL_TORCH);
        blockTypes.add(WoodenBlockType.TORCH);
        blockTypes.add(WoodenBlockType.WALL_TORCH);
        blockTypes.add(WoodenBlockType.WALL_SOUL_TORCH);
        blockTypes.add(WoodenBlockType.POST);

        return Collections.unmodifiableSet(blockTypes);
    }

    private static Set<WoodenBlockType> createBuiltinBlockTypesSet() {
        final Set<WoodenBlockType> builtinBlockTypes = new HashSet<>();
        builtinBlockTypes.add(WoodenBlockType.CRAFTING_TABLE);
        builtinBlockTypes.add(WoodenBlockType.BOOKSHELF);
        // builtinBlockTypes.add(WoodenBlockType.WALL);
        return Collections.unmodifiableSet(builtinBlockTypes);
    }

    @Override
    public String getModId() {
        return Constants.BYG_MOD_ID;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Properties getProperties(final WoodenBlockType blockType) {
        return DefaultWoodType.DEFAULT_BLOCK_PROPERTIES.get(blockType);
    }

    @Override
    public Properties getProperties(final WoodenItemType itemType) {
        return DefaultWoodType.DEFAULT_ITEM_PROPERTIES.get(itemType);
    }

    @Override
    public Set<WoodenBlockType> getBlockTypes() {
        return this.blockTypes;
    }

    @Override
    public Set<WoodenItemType> getItemTypes() {
        return DefaultWoodType.DEFAULT_ITEM_TYPES;
    }

    @Override
    public Set<WoodenTieredItemType> getTieredItemTypes() {
        return DefaultWoodType.DEFAULT_TIERED_ITEM_TYPES;
    }

    @Override
    public Set<WoodenBlockType> getBuiltinBlockTypes() {
        return BUILTIN_BLOCK_TYPES;
    }

    @Override
    public Set<WoodenItemType> getBuiltinItemTypes() {
        return DefaultWoodType.DEFAULT_BUILTIN_ITEM_TYPES;
    }
}
