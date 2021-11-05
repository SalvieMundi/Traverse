package com.terraformersmc.traverse.biome;

import com.terraformersmc.terraform.biomebuilder.DefaultFeature;
import com.terraformersmc.traverse.feature.TraverseConfiguredFeatures;
import com.terraformersmc.traverse.surfacebuilder.TraverseSurfaceBuilders;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredStructureFeatures;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;

public class AridHighlandsBiomes {
	static final Biome ARID_HIGHLANDS = TraverseBiomes.BIOME_TEMPLATE.builder()
			.configureSurfaceBuilder(TraverseSurfaceBuilders.ARID_HIGHLANDS, SurfaceBuilder.GRASS_CONFIG)
			.addDefaultFeatures(DefaultFeature.DESERT_LAKES, DefaultFeature.DESERT_DEAD_BUSHES, DefaultFeature.DESERT_VEGETATION, DefaultFeature.DESERT_FEATURES, DefaultFeature.DEFAULT_FLOWERS, DefaultFeature.SAVANNA_GRASS, DefaultFeature.SAVANNA_TREES)
			.addStructureFeature(ConfiguredStructureFeatures.VILLAGE_DESERT)
			.addStructureFeature(ConfiguredStructureFeatures.PILLAGER_OUTPOST)
			.addStructureFeature(ConfiguredStructureFeatures.RUINED_PORTAL_DESERT)
			.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, TraverseConfiguredFeatures.ARID_SHRUBS)
			.precipitation(Biome.Precipitation.NONE)
			.addDefaultAmbientSpawnEntries()
			.addSpawnEntry(new SpawnSettings.SpawnEntry(EntityType.SPIDER, 100, 4, 4))
			.addSpawnEntry(new SpawnSettings.SpawnEntry(EntityType.ZOMBIE, 38, 4, 4))
			.addSpawnEntry(new SpawnSettings.SpawnEntry(EntityType.ZOMBIE_VILLAGER, 2, 1, 1))
			.addSpawnEntry(new SpawnSettings.SpawnEntry(EntityType.SKELETON, 100, 4, 4))
			.addSpawnEntry(new SpawnSettings.SpawnEntry(EntityType.CREEPER, 100, 4, 4))
			.addSpawnEntry(new SpawnSettings.SpawnEntry(EntityType.SLIME, 100, 4, 4))
			.addSpawnEntry(new SpawnSettings.SpawnEntry(EntityType.ENDERMAN, 10, 1, 4))
			.addSpawnEntry(new SpawnSettings.SpawnEntry(EntityType.WITCH, 5, 1, 1))

			.addSpawnEntry(new SpawnSettings.SpawnEntry(EntityType.RABBIT, 4, 2, 3))
			.addSpawnEntry(new SpawnSettings.SpawnEntry(EntityType.HUSK, 60, 4, 4))
			.category(Biome.Category.DESERT)
			.depth(1.3F)
			.scale(0.3F)
			.temperature(2.0F)
			.downfall(0.0F)
			.effects(TraverseBiomes.createDefaultBiomeEffects()
                    .waterColor(0x55809E)
                    .waterFogColor(0x55809E)
					.grassColor(0xBFB755)
					.foliageColor(0xAEA42A)
			)
			.playerSpawnFriendly()
			.build();
}
