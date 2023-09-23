package dev.zestyblaze.deckedout.registry;

import eu.pb4.polymer.core.api.other.PolymerStat;
import net.minecraft.stats.StatFormatter;

public class StatsRegistry {
    public static void register() {
        PolymerStat.registerStat("times_run", StatFormatter.DEFAULT);
        PolymerStat.registerStat("runs_won", StatFormatter.DEFAULT);
    }
}
