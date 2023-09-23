package dev.zestyblaze.deckedout.item;

import dev.zestyblaze.deckedout.DeckedOut;
import dev.zestyblaze.deckedout.item.base.DOItem;
import dev.zestyblaze.deckedout.util.Tooltip;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ArtifactItem extends DOItem {
    private final int cinderEmberValue;
    private boolean hasLore;
    private final int modelData;

    public ArtifactItem(Item item, int cinderValue, String id) {
        super(new FabricItemSettings().stacksTo(1), item, false);
        this.cinderEmberValue = cinderValue;
        this.modelData = PolymerResourcePackUtils.requestModel(item, DeckedOut.id("item/" + id)).value();
    }

    public ArtifactItem(Item item, int cinderValue, boolean lore, String id) {
        this(item, cinderValue, id);
        this.hasLore = lore;
    }

    @Override
    public Component getName(ItemStack stack) {
        return Component.translatable(this.getDescriptionId(stack)).withStyle(ChatFormatting.BOLD, ChatFormatting.LIGHT_PURPLE);
        /// TODO: Maybe change the color and style of the names, maybe some characters
        //return Component.translatable(this.getDescriptionId(stack)).withStyle(Style.EMPTY.withColor(ChatFormatting.RED).withBold(true));
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltipComponents, TooltipFlag isAdvanced) {
        tooltipComponents.add(new Tooltip("item.deckedout.artifact.cinder").args(Component.literal(String.valueOf(getCinderEmberValue())).withStyle(ChatFormatting.RED)).build());
        if (hasLore) {
            tooltipComponents.add(Component.translatable(getDescriptionId() + ".desc").withStyle(ChatFormatting.DARK_GRAY));
        }
    }

    public int getCinderEmberValue() {
        return this.cinderEmberValue;
    }

    @Override
    public int getPolymerCustomModelData(ItemStack itemStack, @Nullable ServerPlayer player) {
        return this.modelData ;
    }
}
