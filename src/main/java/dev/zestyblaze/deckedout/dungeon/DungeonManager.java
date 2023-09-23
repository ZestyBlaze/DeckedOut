package dev.zestyblaze.deckedout.dungeon;

import net.minecraft.world.entity.player.Player;

public class DungeonManager {
    public static final DungeonManager INSTANCE = new DungeonManager();
    private Player runner = null;

    public void startRun(Player player) {
        if (this.runner != null) {
            this.runner = player;
        }
    }

    public void finishRun() {
        this.runner = null;
    }
}
