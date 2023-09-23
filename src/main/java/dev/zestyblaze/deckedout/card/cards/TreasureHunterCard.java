package dev.zestyblaze.deckedout.card.cards;

import dev.zestyblaze.deckedout.card.CardItem;
import dev.zestyblaze.deckedout.card.CardRarity;
import dev.zestyblaze.deckedout.registry.ComponentRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.world.entity.player.Player;

public class TreasureHunterCard extends CardItem {
    public TreasureHunterCard() {
        super("treasure_hunter", CardRarity.COMMON, ChatFormatting.GOLD, 5);
    }

    @Override
    public void execute(Player player) {
        player.getComponent(ComponentRegistry.DO_PLAYER).addTreasureBonus(4);
    }
}
