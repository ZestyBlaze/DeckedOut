package dev.zestyblaze.deckedout.component.player;

import dev.onyxstudios.cca.api.v3.component.ComponentV3;

public interface IDeckedOutPlayer extends ComponentV3 {
    int getClank();

    void addClank(int amount);

    int getClankBlock();

    void addClankBlock(int amount);

    int getHazard();

    void addHazard(int amount);

    int getHazardBlock();

    void addHazardBlock(int amount);

    int getTreasureBonus();

    void addTreasureBonus(int amount);

    int getCinderBonus();

    void addCinderBonus(int amount);
}
