package dev.zestyblaze.deckedout.card.cards;

import dev.zestyblaze.deckedout.card.CardItem;
import dev.zestyblaze.deckedout.card.CardRarity;
import net.minecraft.ChatFormatting;
import net.minecraft.world.entity.player.Player;

public class CinderSeekerCard extends CardItem {
    public CinderSeekerCard() {
        super("cinder_seeker", CardRarity.COMMON, ChatFormatting.DARK_RED, 5);
    }

    @Override
    public void execute(Player player) {

    }
}
