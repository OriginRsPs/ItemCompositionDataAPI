package cache.composition;

import cache.provider.bonuses.ItemBonuses;
import cache.provider.information.ItemInformation;
import cache.provider.modification.ItemModification;
import cache.provider.properties.ItemProperties;
import api.ItemCompositionProvider;
import cache.provider.ItemProvider;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public final class CompositionManager {
    public static final Int2ObjectMap<ItemProvider> PROVIDER_MAP = new Int2ObjectOpenHashMap<>();
    public static ItemProvider get(final ItemCompositionProvider composition) {
        final int itemId = composition.getId();
        ItemProvider provider = PROVIDER_MAP.getOrDefault(itemId, null);

        if (provider == null)
            provider = new ItemProvider(new ItemInformation(composition.getName(), (composition.getWeight() / 1000D), new ItemBonuses(), new ItemProperties(composition.getWearPos1() == 3 && composition.getWearPos2() == 5), new ItemModification())).build(composition);

        return provider;
    }
}
