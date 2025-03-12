package cache;

import api.ItemCompositionProvider;
import cache.composition.CompositionManager;
import cache.provider.ItemProvider;

import java.util.Map;

/**
 * Implementation of the com.cache.composition information provider for the ItemType com.cache.composition.
 * <p>
 * This class is responsible for providing the necessary com.cache.composition data for items, such as their name, weight, bonuses,
 * properties, and modifications. It implements the {@link ItemCompositionProvider} interface to adhere to the required
 * structure for com.cache.composition providers.
 * </p>
 * <p>
 * Ensure all required methods from {@link ItemCompositionProvider} are properly overridden to provide correct data.
 * </p>
 */
public class Example implements ItemCompositionProvider {

    /**
     * Main method for initializing and interacting with the {@link CompositionManager}.
     * <p>
     * This method demonstrates how to initialize the com.cache.composition manager and access the com.cache.composition data.
     * </p>
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        /**
         * During decoding, you will instantiate the {@link CompositionManager} statically by calling
         * {@link CompositionManager#INSTANCE}. Once the manager is initialized, call {@link CompositionManager#createProvider(ItemCompositionProvider)}
         * with the {@link Example} instance as the parameter.
         */
        CompositionManager.INSTANCE.createProvider(new Example());

        /**
         * After initialization, the {@link CompositionManager} will store the item com.cache.composition data in the static field
         * {@link CompositionManager#PROVIDER_MAP}. You can access this data by calling
         * {@link CompositionManager#PROVIDER_MAP} with the desired item ID.
         * <p>
         * This will give you access to an {@link ItemProvider} object, which contains various types of data, including:
         * <ul>
         *     <li>{@link ItemBonuses} - The bonuses associated with the item.</li>
         *     <li>{@link ItemInformation} - General information about the item (e.g., name, weight, etc.).</li>
         *     <li>{@link ItemModification} - Any modifications applied to the item.</li>
         *     <li>{@link ItemProperties} - Properties of the item, such as its durability, rarity, etc.</li>
         * </ul>
         * </p>
         */
        int itemId = 4151;
        final ItemProvider provider =  CompositionManager.get(itemId);
        System.out.println(provider.toString());
    }

    /**
     * ItemComposition Class Field "id" will be returned here
     * @return
     */
    @Override
    public int getId() {
        return 0;
    }

    /**
     * ItemComposition Class Field "name" will be returned here
     * @return
     */
    @Override
    public String getName() {
        return "";
    }

    /**
     * ItemComposition Class Field "wearPos1" will be returned here
     * @return
     */
    @Override
    public int getWearPos1() {
        return 0;
    }

    /**
     * ItemComposition Class Field "wearPos2" will be returned here
     * @return
     */
    @Override
    public int getWearPos2() {
        return 0;
    }

    /**
     * ItemComposition Class Field "weight" will be returned here
     * @return
     */
    @Override
    public int getWeight() {
        return 0;
    }

    /**
     * ItemComposition Class Object "params" will be returned here
     * @return
     */
    @Override
    public Map<Integer, Object> getParams() {
        return Map.of();
    }
}
