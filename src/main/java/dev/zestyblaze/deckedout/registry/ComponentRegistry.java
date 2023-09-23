package dev.zestyblaze.deckedout.registry;

import dev.onyxstudios.cca.api.v3.component.ComponentKey;
import dev.onyxstudios.cca.api.v3.component.ComponentRegistryV3;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentFactoryRegistry;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentInitializer;
import dev.onyxstudios.cca.api.v3.entity.RespawnCopyStrategy;
import dev.zestyblaze.deckedout.DeckedOut;
import dev.zestyblaze.deckedout.component.pet.IPet;
import dev.zestyblaze.deckedout.component.pet.PetComponent;
import dev.zestyblaze.deckedout.component.player.DOPlayerComponent;
import dev.zestyblaze.deckedout.component.player.IDeckedOutPlayer;
import dev.zestyblaze.deckedout.pet.AbstractPet;

public class ComponentRegistry implements EntityComponentInitializer {
    public static final ComponentKey<IDeckedOutPlayer> DO_PLAYER = ComponentRegistryV3.INSTANCE.getOrCreate(DeckedOut.id("do_player"), IDeckedOutPlayer.class);
    public static final ComponentKey<IPet> PET = ComponentRegistryV3.INSTANCE.getOrCreate(DeckedOut.id("pet"), IPet.class);

    @Override
    public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
        registry.registerForPlayers(DO_PLAYER, player -> new DOPlayerComponent(), RespawnCopyStrategy.ALWAYS_COPY);
        registry.registerFor(AbstractPet.class, PET, entity -> new PetComponent());
    }
}
