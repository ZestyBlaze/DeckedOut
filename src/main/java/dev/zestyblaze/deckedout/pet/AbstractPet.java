package dev.zestyblaze.deckedout.pet;

import eu.pb4.polymer.core.api.entity.PolymerEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class AbstractPet extends TamableAnimal implements PolymerEntity {
    private final EntityType<?> virtualEntity;

    public AbstractPet(EntityType<? extends TamableAnimal> entityType, Level level, EntityType<?> virtualEntity) {
        super(entityType, level);
        this.virtualEntity = virtualEntity;
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FollowOwnerGoal(this, 1.0, 10.0F, 2.0F, false));
    }

    @Override
    public EntityType<?> getPolymerEntityType(ServerPlayer player) {
        return this.virtualEntity;
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel level, AgeableMob otherParent) {
        return null;
    }
}
