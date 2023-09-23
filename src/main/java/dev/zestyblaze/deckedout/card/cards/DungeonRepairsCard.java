package dev.zestyblaze.deckedout.card.cards;

import dev.zestyblaze.deckedout.card.CardItem;
import dev.zestyblaze.deckedout.card.CardRarity;
import dev.zestyblaze.deckedout.registry.ComponentRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.world.entity.player.Player;

public class DungeonRepairsCard extends CardItem {
    public DungeonRepairsCard() {
        super("dungeon_repairs", CardRarity.RARE, ChatFormatting.DARK_BLUE, 3);
    }

    @Override
    public void execute(Player player) {
        player.getComponent(ComponentRegistry.DO_PLAYER).addHazardBlock(7);
        player.getComponent(ComponentRegistry.DO_PLAYER).addClank(1);
    }
}
