package repository;

import repository.api.ItemCompositionProvider;
import repository.composition.CompositionManager;
import repository.provider.ItemProvider;

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

    public ItemProvider provider;

    /**
     * Main method for initializing and interacting with the {@link CompositionManager}.
     * <p>
     * This method demonstrates how to initialize the com.cache.composition manager and access the com.cache.composition data.
     * </p>
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {

        /**
         * During decoding, you will instantiate the {@link CompositionManager} statically by calling
         * {@link CompositionManager#INSTANCE}. Once the manager is initialized, call {@link CompositionManager#createProvider(ItemCompositionProvider)}
         * with the {@link Example} instance as the parameter.
         */
        final Example exampleComposition = new Example();

        /**
         * You Can assign the Variable above to a Class field called Provider
         */
        exampleComposition.provider = CompositionManager.get(exampleComposition);
    }

    /**
     * ItemComposition Class Field "id" will be returned here
     *
     * @return
     */
    @Override
    public int getId() {
        return 0;
    }

    /**
     * ItemComposition Class Field "name" will be returned here
     *
     * @return
     */
    @Override
    public String getName() {
        return "";
    }

    /**
     * ItemComposition Class Field "wearPos1" will be returned here
     *
     * @return
     */
    @Override
    public int getWearPos1() {
        return 0;
    }

    /**
     * ItemComposition Class Field "wearPos2" will be returned here
     *
     * @return
     */
    @Override
    public int getWearPos2() {
        return 0;
    }

    /**
     * ItemComposition Class Field "weight" will be returned here
     *
     * @return
     */
    @Override
    public int getWeight() {
        return 0;
    }

    /**
     * ItemComposition Class Object "params" will be returned here
     *
     * @return
     */
    @Override
    public Map<Integer, Object> getParams() {
        return Map.of();
    }
}
