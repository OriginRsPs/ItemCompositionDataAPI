package cache.composition.params;

public enum Params {

    STAB_ATTACK_BONUS(0),
    SLASH_ATTACK_BONUS(1),
    CRUSH_ATTACK_BONUS(2),
    MAGIC_ATTACK_BONUS(3),
    RANGED_ATTACK_BONUS(4),
    STAB_DEFENCE_BONUS(5),
    SLASH_DEFENCE_BONUS(6),
    CRUSH_DEFENCE_BONUS(7),
    MAGIC_DEFENCE_BONUS(8),
    RANGED_DEFENCE_BONUS(9),
    STRENGTH_BONUS(10),
    PRAYER_BONUS(11),
    RANGED_STRENGTH_WEAPONS_AMMO_BONUS(12),
    ATTACK_SPEED(14),
    SLAYER_CATEGORY(50),
    MAGIC_DAMAGE_BONUS(65),
    MAGIC_STRENGTH_BONUS(299),
    DEMON_DAMAGE_MODIFICATION(128),
    RANGED_STRENGTH_BONUS_EQUIPMENT_BONUS(189),
    DEGRADEABLE_PROPERTY(346),
    SILVER_STRENGTH_BOOST_MODIFICATION(518),
    CORP_BOOST_MODIFICATION(701),
    GOLEM_DAMAGE_MODIFICATION(1178),
    KALPHITE_DAMAGE_MODIFICATION(1353),
    EQUIP_SLOT(1564);

    public static final Params[] VALUES = values();
    public final int id;

    Params(final int id) {
        this.id = id;
    }

    public static Params[] array() {
        return VALUES;
    }

    public int getId() {
        return this.id;
    }


}
