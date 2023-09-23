package dev.zestyblaze.deckedout.card;

import dev.zestyblaze.deckedout.item.base.DOItem;
import dev.zestyblaze.deckedout.util.Tooltip;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public abstract class CardItem extends DOItem {
    private final String id;
    private final CardRarity cardRarity;
    private final ChatFormatting color;

    public CardItem(String name, CardRarity rarity, ChatFormatting nameColor, int maxCount) {
        super(new FabricItemSettings().stacksTo(maxCount), Items.PAPER, false);
        this.id = name;
        this.cardRarity = rarity;
        this.color = nameColor;
    }

    @Override
    public Component getName(ItemStack stack) {
        return Component.translatable("item.deckedout.dungeon_card");
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltipComponents, TooltipFlag isAdvanced) {
        tooltipComponents.add(new Tooltip("deckedout.card").args(Component.translatable("deckedout.card." + id).withStyle(color)).build());
        tooltipComponents.add(new Tooltip("deckedout.card.rarity").args(Component.translatable("deckedout.card.rarity." + cardRarity.getName()).withStyle(cardRarity.getColor())).build());
        tooltipComponents.add(new Tooltip("deckedout.card.desc").args(Component.translatable("deckedout.card.desc." + id).withStyle(ChatFormatting.WHITE)).build());
        if (isEthereal()) tooltipComponents.add(new Tooltip("deckedout.card.ethereal", ChatFormatting.LIGHT_PURPLE).args().build());
    }

    public boolean isEthereal() {
        return false;
    }

    public abstract void execute(Player player);
}
