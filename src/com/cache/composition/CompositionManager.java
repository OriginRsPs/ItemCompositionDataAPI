package cache.composition;

import cache.provider.bonuses.ItemBonuses;
import cache.provider.information.ItemInformation;
import cache.provider.modification.ItemModification;
import cache.provider.properties.ItemProperties;
import api.ItemCompositionProvider;
import cache.provider.ItemProvider;

import java.util.HashMap;
import java.util.Map;

public final class CompositionManager {
    public static final Map<Integer, ItemProvider> PROVIDER_MAP = new HashMap<>();
    public static ItemProvider get(final ItemCompositionProvider composition) {
        ItemProvider provider = PROVIDER_MAP.getOrDefault(composition.getId(), null);
        if (provider == null)
            provider = new ItemProvider(new ItemInformation(composition.getName(), (composition.getWeight() / 1000D), new ItemBonuses(), new ItemProperties(), new ItemModification())).build(composition);
        return provider;
    }
}
