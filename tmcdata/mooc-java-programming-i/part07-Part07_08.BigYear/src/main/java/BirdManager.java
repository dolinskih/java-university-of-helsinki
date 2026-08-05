import java.util.ArrayList;

public class BirdManager {
    private ArrayList<Bird> birds;

    public BirdManager() {
        this.birds = new ArrayList<>();
    }

    public void addBird(String name, String latinName) {
        this.birds.add(new Bird(name, latinName));
    } 

    public void printBirds() {
        for (Bird bird : this.birds) {
            System.out.println(bird);
        }
    }

    public void printBird(String name) {
        for (Bird bird : this.birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
            }
        }
    }

    public void addObservation(String name) {
        for (Bird bird : this.birds) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
            }
        }
    }
}
