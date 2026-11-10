package net.mcreator.demiplanedomicile;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.server.level.ServerLevel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MobStorage extends SavedData {
    private final Map<String, String> data = new ConcurrentHashMap<>();

    public static final SavedData.Factory<MobStorage> FACTORY = new SavedData.Factory<>(
        MobStorage::new,
        MobStorage::load,
        null
    );

    public MobStorage() {}

    public static MobStorage load(CompoundTag tag, HolderLookup.Provider registries) {
        MobStorage savedData = new MobStorage();
        CompoundTag mapTag = tag.getCompound("MobDataMap");
        for (String key : mapTag.getAllKeys()) {
            savedData.data.put(key, mapTag.getString(key));
        }
        return savedData;
    }

    @Override
    public CompoundTag save(CompoundTag tag, HolderLookup.Provider registries) {
        CompoundTag mapTag = new CompoundTag();
        for (Map.Entry<String, String> entry : data.entrySet()) {
            mapTag.putString(entry.getKey(), entry.getValue());
        }
        tag.put("MobDataMap", mapTag);
        return tag;
    }

    public static MobStorage get(ServerLevel level) {
        ServerLevel overworld = level.getServer().overworld();
        return overworld.getDataStorage().computeIfAbsent(FACTORY, "demiplane_mob_storage");
    }

    public Map<String, String> getData() {
        return data;
    }
}