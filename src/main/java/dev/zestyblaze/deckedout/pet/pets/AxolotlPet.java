package dev.zestyblaze.deckedout.pet.pets;

import dev.zestyblaze.deckedout.pet.AbstractPet;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;

public class AxolotlPet extends AbstractPet {
    public AxolotlPet(EntityType<? extends TamableAnimal> entityType, Level level) {
        super(entityType, level, EntityType.AXOLOTL);
    }
}
