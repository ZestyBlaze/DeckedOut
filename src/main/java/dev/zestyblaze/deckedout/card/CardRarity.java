package dev.zestyblaze.deckedout.card;

import net.minecraft.ChatFormatting;

public enum CardRarity {
    COMMON("common", ChatFormatting.GRAY),
    UNCOMMON("uncommon", ChatFormatting.GREEN),
    RARE("rare", ChatFormatting.BLUE),
    LEGENDARY("legendary", ChatFormatting.GOLD);

    private final String name;
    private final ChatFormatting color;

    CardRarity(String id, ChatFormatting formatting) {
        this.name = id;
        this.color = formatting;
    }

    public String getName() {
        return this.name;
    }

    public ChatFormatting getColor() {
        return this.color;
    }
}
