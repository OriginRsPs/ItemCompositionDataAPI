package repository.composition;

import repository.provider.bonuses.ItemBonuses;
import repository.provider.information.ItemInformation;
import repository.provider.modification.ItemModification;
import repository.provider.properties.ItemProperties;
import repository.api.ItemCompositionProvider;
import repository.provider.ItemProvider;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public final class CompositionManager {
    public static final Int2ObjectMap<ItemProvider> PROVIDER_MAP = new Int2ObjectOpenHashMap<>();
    public static ItemProvider get(final ItemCompositionProvider composition) {
        final int itemId = composition.getId();
        return PROVIDER_MAP.getOrDefault(itemId, new ItemProvider(new ItemInformation(composition.getName(), (composition.getWeight() / 1000D), new ItemBonuses(), new ItemProperties(composition.getWearPos1() == 3 && composition.getWearPos2() == 5), new ItemModification())).build(composition));
    }
}
