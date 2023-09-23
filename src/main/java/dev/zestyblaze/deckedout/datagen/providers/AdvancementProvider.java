package dev.zestyblaze.deckedout.datagen.providers;

import dev.zestyblaze.deckedout.DeckedOut;
import dev.zestyblaze.deckedout.advancement.FirstCompletionAdvancement;
import dev.zestyblaze.deckedout.advancement.FirstEntryAdvancement;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.FrameType;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

public class AdvancementProvider extends FabricAdvancementProvider {
    public AdvancementProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        Advancement firstEntry = Advancement.Builder.advancement()
                .display(
                        Items.ICE,
                        Component.translatable("advancements.deckedout.first_entry"),
                        Component.translatable("advancements.deckedout.first_entry.desc"),
                        new ResourceLocation("textures/gui/advancements/backgrounds/adventure.png"),
                        FrameType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("first_entry", new FirstEntryAdvancement.Conditions())
                .build(DeckedOut.id("root"));
        consumer.accept(firstEntry);

        Advancement firstCompletion = Advancement.Builder.advancement()
                .display(
                        Items.ICE,
                        Component.translatable("advancements.deckedout.first_completion"),
                        Component.translatable("advancements.deckedout.first_completion.desc"),
                        new ResourceLocation("textures/gui/advancements/backgrounds/adventure.png"),
                        FrameType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("first_completion", new FirstCompletionAdvancement.Conditions())
                .parent(firstEntry)
                .build(DeckedOut.id("first_completion"));
        consumer.accept(firstCompletion);
    }
}
