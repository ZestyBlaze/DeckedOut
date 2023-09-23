package dev.zestyblaze.deckedout.registry;

import com.google.common.collect.Sets;
import dev.zestyblaze.deckedout.DeckedOut;
import dev.zestyblaze.deckedout.card.cards.*;
import dev.zestyblaze.deckedout.item.ArtifactItem;
import dev.zestyblaze.deckedout.item.base.DOItem;
import dev.zestyblaze.deckedout.pet.AbstractPetItem;
import eu.pb4.polymer.core.api.item.PolymerBlockItem;
import eu.pb4.polymer.core.api.item.PolymerItemGroupUtils;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;

import java.util.Set;

public class ItemRegistry {
    public static final Set<Item> ITEMS = Sets.newLinkedHashSet();
    private static final CreativeModeTab DECKED_OUT_TAB = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ItemRegistry.CINDER_SOUL))
            .title(Component.translatable("itemGroup.decked_out"))
            .displayItems((itemDisplayParameters, output) -> ItemRegistry.ITEMS.forEach(output::accept))
            .build();

    public static final Item MAGMA_SHARD = register("magma_shard", new DOItem(Items.MAGMA_BLOCK, true, ChatFormatting.RED));
    public static final Item CINDER_SOUL = register("cinder_soul", new DOItem(Items.MAGMA_CREAM, true, ChatFormatting.RED));
    public static final Item COIN = register("coin", new DOItem(Items.GOLD_NUGGET, true, ChatFormatting.YELLOW));
    public static final Item CROWN = register("crown", new DOItem(Items.GOLD_INGOT, true, ChatFormatting.YELLOW));
    public static final Item BLAZING_LEMON = register("blazing_lemon", new ArtifactItem(Items.GOLDEN_APPLE, 7, true, "blazing_lemon")); // Me
    public static final Item KINGS_EMERALD = register("kings_emerald", new ArtifactItem(Items.EMERALD, 9, true, "kings_emerald")); // Tom
    public static final Item LUMBERJACKS_AXE = register("lumberjacks_axe", new ArtifactItem(Items.IRON_AXE, 9, true, "lumberjacks_axe")); // Jake
    public static final Item ADVENTURERS_HAT = register("adventurers_hat", new ArtifactItem(Items.LEATHER_HELMET, 12, true, "adventurers_hat")); // Billy
    public static final Item BAMBOO_OF_DESTINY = register("bamboo_of_destiny", new ArtifactItem(Items.BAMBOO, 13, true, "bamboo_of_destiny")); // Sam
    public static final Item JAM_JAR = register("jam_jar", new ArtifactItem(Items.POTION, 16, true, "jam_jar")); // Jam
    public static final Item BETH_ARTIFACT = register("beth_artifact", new ArtifactItem(Items.AXOLOTL_BUCKET, 1, true, "beth_artifact")); // Beth
    //Smacksalotyl

    public static final Item AXOLOTL_PET_ITEM = register("axolotl_pet", new AbstractPetItem(Items.AXOLOTL_SPAWN_EGG, EntityRegistry.AXOLOTL_PET));

    public static final Item STUMBLE_CARD = register("stumble_card", new StumbleCard());
    public static final Item SNEAK_CARD = register("sneak_card", new SneakCard());
    public static final Item STABILITY = register("stability_card", new StabilityCard());
    public static final Item TREASURE_HUNTER = register("treasure_hunter_card", new TreasureHunterCard());
    public static final Item CINDER_SEEKER = register("cinder_seeker_card", new CinderSeekerCard());
    public static final Item MOMENT_OF_CLARITY_CARD = register("moment_of_clarity_card", new MomentOfClarityCard());
    // Adrenaline Rush - Add one hazard, for every 20 seconds, every heartbeat gains +1 treasure. Uncommon
    // Beast Sense - Add one clank, the next 3 cards cause Ravagers to glow, Uncommon
    public static final Item EVASION_CARD = register("evasion_card", new EvasionCard());
    public static final Item CINDER_FOCUS = register("cinder_focus_card", new CinderFocusCard());
    public static final Item DUNGEON_REPAIRS_CARD = register("dungeon_repairs_card", new DungeonRepairsCard());

    public static final Item ASH_BLOCK = register("ash_block", new PolymerBlockItem(BlockRegistry.ASH_BLOCK, new FabricItemSettings(), Items.BASALT));
    public static final Item SWEET_BERRY_BUSH = register("sweet_berry_bush", new PolymerBlockItem(BlockRegistry.SWEET_BERRY_BUSH, new FabricItemSettings(), Items.SWEET_BERRIES));

    public static Item register(String name, Item item) {
        Item item1 = Registry.register(BuiltInRegistries.ITEM, DeckedOut.id(name), item);
        ITEMS.add(item1);
        return item1;
    }

    public static void register() {
        PolymerItemGroupUtils.registerPolymerItemGroup(DeckedOut.id("creative_tab"), DECKED_OUT_TAB);
        PolymerResourcePackUtils.addModAssets(DeckedOut.MOD_ID);
    }
}
