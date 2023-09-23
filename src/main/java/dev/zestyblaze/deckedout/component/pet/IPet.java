package dev.zestyblaze.deckedout.component.pet;

import dev.onyxstudios.cca.api.v3.component.ComponentV3;

public interface IPet extends ComponentV3 {
    int getLevel();

    void incrementLevel();

    void addLevel(int amount);
}
