package dev.zestyblaze.deckedout.component.pet;

import net.minecraft.nbt.CompoundTag;

public class PetComponent implements IPet {
    private int level = 1;

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public void incrementLevel() {
        if (this.level++ < 100) {
            this.level++;
        }
    }

    @Override
    public void addLevel(int amount) {
        // Gotta do some math shit here
    }

    @Override
    public void writeToNbt(CompoundTag tag) {
        tag.putInt("level", getLevel());
    }

    @Override
    public void readFromNbt(CompoundTag tag) {
        this.level = tag.getInt("level");
    }
}
