package dev.zestyblaze.deckedout.pet;

import dev.onyxstudios.cca.api.v3.component.ComponentRegistryV3;
import dev.zestyblaze.deckedout.item.base.DOItem;
import dev.zestyblaze.deckedout.registry.ComponentRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AbstractPetItem extends DOItem {
    private final EntityType<? extends AbstractPet> storedEntity;

    public AbstractPetItem(Item item, EntityType<? extends AbstractPet> entity) {
        super(new FabricItemSettings().maxCount(1), item, false);
        this.storedEntity = entity;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltipComponents, TooltipFlag isAdvanced) {
        tooltipComponents.add(Component.literal("Level: " + ComponentRegistry.PET.get(storedEntity).getLevel()));
    }
}
