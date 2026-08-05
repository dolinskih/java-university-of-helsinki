import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = suitcase.totalWeight();

        for (Suitcase pSuitcase : this.suitcases) {
            totalWeight += pSuitcase.totalWeight();
        }

        if (totalWeight <= maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    @Override
    public String toString() {
        int totalWeight = 0;

        for (Suitcase suitcase : this.suitcases) {
            totalWeight += suitcase.totalWeight();
        }

        return this.suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }
}
