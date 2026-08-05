import java.util.Scanner;

public class UI {
    private Scanner scanner;
    private BirdManager birdManager;

    public UI(Scanner scanner, BirdManager birdManager) {
        this.scanner = scanner;
        this.birdManager = birdManager;
    }

    public void start() {
        while (true) {
            System.out.println("?");
            String command = this.scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.println("Name:");
                String name = this.scanner.nextLine();
                System.out.println("Name in Latin:");
                String latinName = this.scanner.nextLine();
                this.birdManager.addBird(name, latinName);
            } else if(command.equals("Observation")) {
                System.out.println("Bird?");
                String name = this.scanner.nextLine();
                this.birdManager.addObservation(name);
            } else if(command.equals("All")) {
                this.birdManager.printBirds();
            } else if(command.equals("One")) {
                System.out.println("Bird?");
                String name = this.scanner.nextLine();
                this.birdManager.printBird(name);
            }
        }
    }
}
