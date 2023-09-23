package dev.zestyblaze.deckedout.item.base;

import eu.pb4.polymer.core.api.item.PolymerItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

public class DOItem extends Item implements PolymerItem {
    private ChatFormatting chatFormatting = ChatFormatting.WHITE;
    private final Item virtualItem;
    private final boolean hasGlint;

    public DOItem(Properties properties, Item item, boolean glint) {
        super(properties);
        this.virtualItem = item;
        this.hasGlint = glint;
    }

    public DOItem(Item item, boolean glint) {
        this(new FabricItemSettings(), item, glint);
    }

    public DOItem(Item item, boolean glint, ChatFormatting chatFormatting) {
        this(item, glint);
        this.chatFormatting = chatFormatting;
    }

    @Override
    public Component getName(ItemStack stack) {
        return Component.translatable(this.getDescriptionId(stack)).withStyle(this.chatFormatting);
    }

    @Override
    public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayer player) {
        return this.virtualItem;
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return this.hasGlint;
    }
}
