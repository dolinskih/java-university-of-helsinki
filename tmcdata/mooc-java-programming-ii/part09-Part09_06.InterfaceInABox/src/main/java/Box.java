import java.util.ArrayList;

public class Box implements Packable {
    private ArrayList<Packable> items;
    private double maxWeight;

    public Box(double maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void add(Packable packable) {
        if (this.weight() + packable.weight() <= this.maxWeight) {
            this.items.add(packable);
        }
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }

    public double weight() {
        double currentWeight = 0.0;

        for (Packable item : this.items) {
            currentWeight += item.weight();
        }

        return currentWeight;
    }
}
