package dev.zestyblaze.deckedout.component.player;

import net.minecraft.nbt.CompoundTag;

public class DOPlayerComponent implements IDeckedOutPlayer {
    private int clank = 0;
    private int clankBlock = 0;
    private int hazard = 0;
    private int hazardBlock = 0;
    private int treasureBonus = 0;
    private int cinderBonus = 0;

    @Override
    public int getClank() {
        return this.clank;
    }

    @Override
    public void addClank(int amount) {
        this.clank += amount;
    }

    @Override
    public int getClankBlock() {
        return this.clankBlock;
    }

    @Override
    public void addClankBlock(int amount) {
        this.clankBlock += amount;
    }

    @Override
    public int getHazard() {
        return this.hazard;
    }

    @Override
    public void addHazard(int amount) {
        this.hazard += amount;
    }

    @Override
    public int getHazardBlock() {
        return this.hazardBlock;
    }

    @Override
    public void addHazardBlock(int amount) {
        this.hazardBlock += amount;
    }

    @Override
    public int getTreasureBonus() {
        return this.treasureBonus;
    }

    @Override
    public void addTreasureBonus(int amount) {
        this.treasureBonus += amount;
    }

    @Override
    public int getCinderBonus() {
        return this.cinderBonus;
    }

    @Override
    public void addCinderBonus(int amount) {
        this.cinderBonus += amount;
    }

    @Override
    public void writeToNbt(CompoundTag tag) {
        tag.putInt("clank", getClank());
        tag.putInt("clankBlock", getClankBlock());
        tag.putInt("hazard", getHazard());
        tag.putInt("hazardBlock", getHazardBlock());
        tag.putInt("treasureBonus", getTreasureBonus());
        tag.putInt("cinderBonus", getCinderBonus());
    }

    @Override
    public void readFromNbt(CompoundTag tag) {
        this.clank = tag.getInt("clank");
        this.clankBlock = tag.getInt("clankBlock");
        this.hazard = tag.getInt("hazard");
        this.hazardBlock = tag.getInt("hazardBlock");
        this.treasureBonus = tag.getInt("treasureBonus");
        this.cinderBonus = tag.getInt("cinderBonus");
    }
}
