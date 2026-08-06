import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> organisms;

    public Herd() {
        this.organisms = new ArrayList<>();
    }

    @Override
    public String toString() {
        String organismsData = "";

        for (int i = 0; i < this.organisms.size(); i++) {
            if (i != this.organisms.size() - 1) {
                organismsData += this.organisms.toString() + "\n";
            } else {
                organismsData += this.organisms.toString();
            }
        }

        return organismsData;
    }

    public void addToHerd(Movable movable) {
        this.organisms.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable movable : this.organisms) {
            movable.move(dx, dy);
        }
    }
}
