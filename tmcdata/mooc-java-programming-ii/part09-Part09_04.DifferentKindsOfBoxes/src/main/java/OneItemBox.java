public class OneItemBox extends Box {
    private Item item;

    public OneItemBox() {
        super();
    }

    public void add(Item item) {
        if (this.item == null) {
            this.item = item;
        }
    }

    public boolean isInBox(Item item) {
        if (this.item != null) {
            if (this.item.equals(item)) {
                return true;
            }
        }

        return false;
    }
}
