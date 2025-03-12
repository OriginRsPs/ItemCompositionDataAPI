package cache.provider.properties;

public class ItemProperties {

    private boolean degradeable;
    private boolean corpBane;
    private boolean isTwoHanded;

    public ItemProperties(final boolean isTwoHanded) {
        this.isTwoHanded = isTwoHanded;
    }

    public boolean isDegradeable() {
        return degradeable;
    }

    public void setDegradeable(boolean degradeable) {
        this.degradeable = degradeable;
    }

    public boolean isCorpBane() {
        return corpBane;
    }

    public void setCorpBane(boolean corpBane) {
        this.corpBane = corpBane;
    }

    public boolean isTwoHanded() {
        return isTwoHanded;
    }

    public void setTwoHanded(boolean twoHanded) {
        isTwoHanded = twoHanded;
    }

    @Override
    public String toString() {
        return "ItemProperties{" +
                "degradeable=" + degradeable +
                ", corpBane=" + corpBane +
                ", isTwoHanded=" + isTwoHanded +
                '}';
    }
}
