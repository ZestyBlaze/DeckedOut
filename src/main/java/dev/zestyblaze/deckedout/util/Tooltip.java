package dev.zestyblaze.deckedout.util;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;

/**
 * A Snapshot of a Utility class from BlakeBr0's Cucumber Library for building Strings
 * <a href="https://github.com/BlakeBr0/Cucumber/blob/1.19.4/src/main/java/com/blakebr0/cucumber/util/Localizable.java">...</a>
 */
public class Tooltip {
    private final String key;
    private final ChatFormatting defaultColor;

    public Tooltip(String key) {
        this(key, ChatFormatting.GRAY);
    }

    public Tooltip(String key, ChatFormatting defaultColor) {
        this.key = key;
        this.defaultColor = defaultColor;
    }

    public LocalizableBuilder args(Object... args) {
        return this.builder().args(args);
    }

    private LocalizableBuilder builder() {
        return new LocalizableBuilder(this.key).color(this.defaultColor);
    }

    public static class LocalizableBuilder {
        private final String key;
        private Object[] args = new Object[0];
        private ChatFormatting color;

        public LocalizableBuilder(String key) {
            this.key = key;
        }

        public LocalizableBuilder args(Object... args) {
            this.args = args;
            return this;
        }

        public LocalizableBuilder color(ChatFormatting color) {
            this.color = color;
            return this;
        }

        public MutableComponent build() {
            MutableComponent component = Component.translatable(this.key, this.args);

            if (this.color != null) {
                component.withStyle(this.color);
            }

            return component;
        }
    }
}
