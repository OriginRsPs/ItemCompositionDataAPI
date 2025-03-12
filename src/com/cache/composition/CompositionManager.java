package cache.composition;

import cache.provider.bonuses.ItemBonuses;
import cache.provider.information.ItemInformation;
import cache.provider.modification.ItemModification;
import cache.provider.properties.ItemProperties;
import api.ItemCompositionProvider;
import cache.provider.ItemProvider;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public final class CompositionManager {

    public static final CompositionManager INSTANCE = new CompositionManager();
    public static final Map<Integer, ItemProvider> PROVIDER_MAP = new HashMap<>();

    public static @NotNull ItemProvider get(int itemId) {
        final ItemProvider provider = PROVIDER_MAP.getOrDefault(itemId, null);
        if (provider == null)
            throw new NullPointerException("ItemComposition Provider does not exist for Id: " + itemId);

        return provider;
    }

    public void init(final ItemCompositionProvider composition) {
        final String name = composition.getName();
        final double weight = composition.getWeight() / 1000D;
        final ItemBonuses bonuses = new ItemBonuses();
        final ItemProperties properties = new ItemProperties();
        final ItemModification modification = new ItemModification();

        final ItemProvider provider = new ItemProvider(new ItemInformation(name, weight, bonuses, properties, modification));
        provider.build(composition);
    }
}
