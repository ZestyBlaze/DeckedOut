package dev.zestyblaze.deckedout.registry;

import dev.zestyblaze.deckedout.DeckedOut;
import dev.zestyblaze.deckedout.pet.pets.AxolotlPet;
import eu.pb4.polymer.core.api.entity.PolymerEntityUtils;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.animal.axolotl.Axolotl;

public class EntityRegistry {
    public static final EntityType<AxolotlPet> AXOLOTL_PET = FabricEntityTypeBuilder.create(MobCategory.CREATURE, AxolotlPet::new)
            .dimensions(EntityDimensions.scalable(0.75F, 0.42F))
            .build();

    public static void register() {
        Registry.register(BuiltInRegistries.ENTITY_TYPE, DeckedOut.id("axolotl_pet"), AXOLOTL_PET);
        FabricDefaultAttributeRegistry.register(AXOLOTL_PET, Axolotl.createAttributes());
        PolymerEntityUtils.registerType(AXOLOTL_PET);
    }
}
