package cache.provider.information;

import cache.provider.bonuses.ItemBonuses;
import cache.provider.modification.ItemModification;
import cache.provider.properties.ItemProperties;

public class ItemInformation {

    final String name;
    final double weight;
    final ItemBonuses itemBonuses;
    final ItemProperties itemProperties;
    final ItemModification itemModification;

    public ItemInformation(final String name, double weight, final ItemBonuses itemBonuses, final ItemProperties itemProperties, final ItemModification itemModification) {
        this.name = name;
        this.weight = weight;
        this.itemBonuses = itemBonuses;
        this.itemProperties = itemProperties;
        this.itemModification = itemModification;
    }

    public ItemBonuses getItemBonuses() {
        return itemBonuses;
    }

    public ItemProperties getItemProperties() {
        return itemProperties;
    }

    public ItemModification getItemModification() {
        return itemModification;
    }

    @Override
    public String toString() {
        return "ItemInformation{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", itemBonuses=" + itemBonuses +
                ", itemProperties=" + itemProperties +
                ", itemModification=" + itemModification +
                '}';
    }
}
