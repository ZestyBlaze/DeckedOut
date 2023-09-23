package dev.zestyblaze.deckedout.card.cards;

import dev.zestyblaze.deckedout.card.CardItem;
import dev.zestyblaze.deckedout.card.CardRarity;
import dev.zestyblaze.deckedout.registry.ComponentRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.world.entity.player.Player;

public class MomentOfClarityCard extends CardItem {
    public MomentOfClarityCard() {
        super("moment_of_clarity", CardRarity.COMMON, ChatFormatting.YELLOW, 3);
    }

    @Override
    public boolean isEthereal() {
        return true;
    }

    @Override
    public void execute(Player player) {
        player.getComponent(ComponentRegistry.DO_PLAYER).addClankBlock(2);
        player.getComponent(ComponentRegistry.DO_PLAYER).addHazardBlock(2);
        player.getComponent(ComponentRegistry.DO_PLAYER).addTreasureBonus(2);
        player.getComponent(ComponentRegistry.DO_PLAYER).addCinderBonus(2);
    }
}
