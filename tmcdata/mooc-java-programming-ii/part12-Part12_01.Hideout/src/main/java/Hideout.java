public class Hideout<T> {
    private T value;

    public Hideout() {
        this.value = null;
    }

    public void putIntoHideout(T toHide) {
        this.value = toHide;
    }

    public T takeFromHideout() {
        T temporaryValue = this.value;
        this.value = null;
        return temporaryValue;
    }

    public boolean isInHideout() {
        if (this.value == null) {
            return false;
        }

        return true;
    }
}
