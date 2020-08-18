package me.crashcringle.monstersplus.monsters;

import org.bukkit.block.Biome;

public class BiomeSets {
	public static Biome[] COLD = new Biome[] { Biome.SNOWY_TAIGA, Biome.SNOWY_TAIGA_MOUNTAINS, Biome.TAIGA_HILLS, Biome.SNOWY_BEACH,
			Biome.ICE_SPIKES, Biome.FROZEN_OCEAN, Biome.SNOWY_MOUNTAINS, Biome.FROZEN_RIVER, Biome.COLD_OCEAN, Biome.DEEP_COLD_OCEAN,
			Biome.FROZEN_OCEAN, Biome.FROZEN_RIVER};
	
	public static Biome[] DESERT = new Biome[] { Biome.DESERT, Biome.DESERT_HILLS };
	
	public static Biome[] HOT = new Biome[] { Biome.DESERT, Biome.DESERT_HILLS, Biome.BADLANDS, Biome.BADLANDS_PLATEAU, Biome.ERODED_BADLANDS,
			Biome.CRIMSON_FOREST, Biome.WARPED_FOREST, Biome.BASALT_DELTAS, Biome.NETHER_WASTES, Biome.SOUL_SAND_VALLEY };
	
	public static Biome[] HELL = new Biome[] { Biome.CRIMSON_FOREST, Biome.WARPED_FOREST, Biome.BASALT_DELTAS, Biome.NETHER_WASTES, Biome.SOUL_SAND_VALLEY};
	
	public static Biome[] SWAMP = new Biome[] { Biome.SWAMP, Biome.SWAMP_HILLS };
	
	public static Biome[] EXTREME_HILLS = new Biome[] { Biome.SNOWY_MOUNTAINS, Biome.GRAVELLY_MOUNTAINS, Biome.TAIGA_MOUNTAINS, Biome.WOODED_MOUNTAINS,
			Biome.SNOWY_TAIGA_MOUNTAINS, Biome.MOUNTAINS};
	public static Biome[] RIVER = new Biome[] { Biome.RIVER, Biome.FROZEN_RIVER };
	
	public static Biome[] WATERFRONT = new Biome[] { Biome.RIVER, Biome.DEEP_LUKEWARM_OCEAN, Biome.DEEP_OCEAN, 
			Biome.LUKEWARM_OCEAN, Biome.WARM_OCEAN, Biome.DESERT_LAKES, Biome.DEEP_COLD_OCEAN, Biome.OCEAN };

	private BiomeSets() {
	}
}
