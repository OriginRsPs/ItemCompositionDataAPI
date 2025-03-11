package composition.modification;

public class ItemModification {

    double demonDamage;
    int golemDamage;
    int kalphiteDamage;
    int silverStrengthBoost;

    public double getDemonDamage() {
        return demonDamage;
    }

    public void setDemonDamage(double demonDamage) {
        this.demonDamage = demonDamage;
    }

    public int getGolemDamage() {
        return golemDamage;
    }

    public void setGolemDamage(int golemDamage) {
        this.golemDamage = golemDamage;
    }

    public int getKalphiteDamage() {
        return kalphiteDamage;
    }

    public void setKalphiteDamage(int kalphiteDamage) {
        this.kalphiteDamage = kalphiteDamage;
    }

    public int getSilverStrengthBoost() {
        return silverStrengthBoost;
    }

    public void setSilverStrengthBoost(int silverStrengthBoost) {
        this.silverStrengthBoost = silverStrengthBoost;
    }

    @Override
    public String toString() {
        return "ItemModification{" +
                "demonDamage=" + demonDamage +
                ", golemDamage=" + golemDamage +
                ", kalphiteDamage=" + kalphiteDamage +
                ", silverStrengthBoost=" + silverStrengthBoost +
                '}';
    }
}
