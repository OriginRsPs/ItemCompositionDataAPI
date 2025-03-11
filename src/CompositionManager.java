
import composition.ItemCompositionProvider;
import composition.bonuses.ItemBonuses;
import composition.information.ItemInformation;
import composition.modification.ItemModification;
import composition.properties.ItemProperties;

import java.util.HashMap;
import java.util.Map;

public final class CompositionManager {

    public static final CompositionManager INSTANCE = new CompositionManager();
    public static final Map<Integer, ItemProvider> PROVIDER_MAP = new HashMap<>();

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
