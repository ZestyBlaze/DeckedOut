package dev.zestyblaze.deckedout.card.cards;

import dev.zestyblaze.deckedout.card.CardItem;
import dev.zestyblaze.deckedout.card.CardRarity;
import dev.zestyblaze.deckedout.registry.ComponentRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.world.entity.player.Player;

public class CinderFocusCard extends CardItem {
    public CinderFocusCard() {
        super("cinder_focus", CardRarity.UNCOMMON, ChatFormatting.DARK_RED, 3);
    }

    @Override
    public void execute(Player player) {
        player.getComponent(ComponentRegistry.DO_PLAYER).addCinderBonus(4);
    }
}
