package dev.zestyblaze.deckedout.registry;

import dev.zestyblaze.deckedout.advancement.FirstCompletionAdvancement;
import dev.zestyblaze.deckedout.advancement.FirstEntryAdvancement;
import net.minecraft.advancements.CriteriaTriggers;

public class CriteriaRegistry {
    public static FirstEntryAdvancement FIRST_TIME_ENTRY = CriteriaTriggers.register(new FirstEntryAdvancement());
    public static FirstCompletionAdvancement FIRST_TIME_COMPLETION = CriteriaTriggers.register(new FirstCompletionAdvancement());

    public static void register() {}
}
