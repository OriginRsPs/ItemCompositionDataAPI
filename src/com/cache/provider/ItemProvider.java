package cache.provider;

import api.ItemCompositionProvider;
import cache.composition.CompositionManager;
import cache.provider.bonuses.ItemBonuses;
import cache.provider.information.ItemInformation;
import cache.provider.modification.ItemModification;
import cache.composition.params.Params;
import cache.provider.properties.ItemProperties;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class ItemProvider {

    final ItemInformation itemInformation;

    public ItemProvider(final ItemInformation itemInformation) {
        this.itemInformation = itemInformation;
    }

    public ItemProvider build(final ItemCompositionProvider compositionProvider) {
        final DefaultResult result = getDefaultResult();
        setParamInformation(compositionProvider, result.bonuses, result.modification, result.properties);
        CompositionManager.PROVIDER_MAP.put(compositionProvider.getId(), this);
        return this;
    }

    final @NotNull DefaultResult getDefaultResult() {
        return new DefaultResult(itemInformation.getItemBonuses(), itemInformation.getItemModification(), itemInformation.getItemProperties());
    }

    private static class DefaultResult {
        public final ItemBonuses bonuses;
        public final ItemModification modification;
        public final ItemProperties properties;

        public DefaultResult(ItemBonuses bonuses, ItemModification modification, ItemProperties properties) {
            this.bonuses = bonuses;
            this.modification = modification;
            this.properties = properties;
        }
    }

    void setParamInformation(final ItemCompositionProvider compositionProvider, final ItemBonuses bonuses, final ItemModification modification, final ItemProperties properties) {
        final Map<Integer, Object> params = compositionProvider.getParams();
        for (final Params param : Params.array()) {
            final Object value = params.get(param.getId());
            if (value != null) {
                if (value instanceof String)
                    continue;

                final int result = (Integer) value;
                final String paramName = param.name();
                switch (paramName) {
                    case "STAB_ATTACK_BONUS":
                        bonuses.setAstab(result);
                        break;
                    case "SLASH_ATTACK_BONUS":
                        bonuses.setAslash(result);
                        break;
                    case "CRUSH_ATTACK_BONUS":
                        bonuses.setAcrush(result);
                        break;
                    case "MAGIC_ATTACK_BONUS":
                        bonuses.setAmagic(result);
                        break;
                    case "RANGED_ATTACK_BONUS":
                        bonuses.setArange(result);
                        break;
                    case "STAB_DEFENCE_BONUS":
                        bonuses.setDstab(result);
                        break;
                    case "SLASH_DEFENCE_BONUS":
                        bonuses.setDslash(result);
                        break;
                    case "CRUSH_DEFENCE_BONUS":
                        bonuses.setDcrush(result);
                        break;
                    case "MAGIC_DEFENCE_BONUS":
                        bonuses.setDmagic(result);
                        break;
                    case "RANGED_DEFENCE_BONUS":
                        bonuses.setDrange(result);
                        break;
                    case "STRENGTH_BONUS":
                        bonuses.setStr(result);
                        break;
                    case "PRAYER_BONUS":
                        bonuses.setPrayer(result);
                        break;
                    case "RANGED_STRENGTH_WEAPONS_AMMO":
                        bonuses.setrStrAmmoWeapon(result);
                        break;
                    case "SPEED":
                        bonuses.setAspeed(result);
                        break;
                    case "MAGIC_DAMAGE_BONUS":
                        bonuses.setMagicDamageBonus(result);
                        break;
                    case "MAGIC_STRENGTH_BONUS":
                        bonuses.setMagicStrengthBonus(result);
                        break;
                    case "DEMON_DAMAGE":
                        double temp = (result / 100.00D);
                        modification.setDemonDamage(temp);
                        break;
                    case "RANGED_STRENGTH_BONUS_EQUIPMENT":
                        bonuses.setrStrEquipment(result);
                        break;
                    case "DEGRADEABLE":
                        properties.setDegradeable(result == 1);
                        break;
                    case "SILVER_STRENGTH_BOOST":
                        modification.setSilverStrengthBoost(result);
                        break;
                    case "CORP_BOOST":
                        properties.setCorpBane(result == 1);
                        break;
                    case "GOLEM_DAMAGE":
                        modification.setGolemDamage(result);
                        break;
                    case "KALPHITE_DAMAGE":
                        modification.setKalphiteDamage(result);
                        break;
                    case "EQUIP_SLOT":
                        bonuses.setSlot(result);
                        break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "ItemProvider{" +
                "itemInformation=" + itemInformation +
                '}';
    }
}
