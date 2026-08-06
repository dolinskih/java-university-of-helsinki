import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int maxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        super();
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Item item) {
        int currentWeight = 0;
        for (Item pItem : this.items) {
            currentWeight += pItem.getWeight();
        }

        if (item.getWeight() + currentWeight <= this.maxWeight) {
            items.add(item);
        }
    }

    public boolean isInBox(Item item) {
        if (this.items.contains(item)) {
            return true;
        }

        return false;
    }
}
