package dev.zestyblaze.deckedout.card.cards;

import dev.zestyblaze.deckedout.card.CardItem;
import dev.zestyblaze.deckedout.card.CardRarity;
import dev.zestyblaze.deckedout.registry.ComponentRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.world.entity.player.Player;

public class StabilityCard extends CardItem {
    public StabilityCard() {
        super("stability", CardRarity.COMMON, ChatFormatting.RED, 5);
    }

    @Override
    public void execute(Player player) {
        player.getComponent(ComponentRegistry.DO_PLAYER).addHazardBlock(2);
    }
}
