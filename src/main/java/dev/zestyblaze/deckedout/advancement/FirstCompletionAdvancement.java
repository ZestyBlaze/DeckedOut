package dev.zestyblaze.deckedout.advancement;

import com.google.gson.JsonObject;
import dev.zestyblaze.deckedout.DeckedOut;
import net.minecraft.advancements.critereon.AbstractCriterionTriggerInstance;
import net.minecraft.advancements.critereon.ContextAwarePredicate;
import net.minecraft.advancements.critereon.DeserializationContext;
import net.minecraft.advancements.critereon.SimpleCriterionTrigger;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;

public class FirstCompletionAdvancement extends SimpleCriterionTrigger<FirstCompletionAdvancement.Conditions> {
    public static final ResourceLocation ID = DeckedOut.id("first_completion");

    @Override
    protected Conditions createInstance(JsonObject json, ContextAwarePredicate predicate, DeserializationContext deserializationContext) {
        return new Conditions();
    }

    @Override
    public ResourceLocation getId() {
        return ID;
    }

    public void trigger(ServerPlayer player) {
        trigger(player, (conditions -> true));
    }

    public static class Conditions extends AbstractCriterionTriggerInstance {
        public Conditions() {
            super(ID, ContextAwarePredicate.ANY);
        }
    }
}
