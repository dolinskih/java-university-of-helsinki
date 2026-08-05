import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();

            if (command.equals("end")) {
                break;
            }

            if (command.equals("add")) {
                System.out.println("Word:");
                String word = this.scanner.nextLine();
                System.out.println("Translation:");
                String translation = this.scanner.nextLine();

                this.dict.add(word, translation);
            } else if (command.equals("search")) {
                System.out.println("To be translated:");
                String word = this.scanner.nextLine();
                String translation = this.dict.translate(word);
                
                if (translation != null) {
                    System.out.println("Translation: " + this.dict.translate(word));
                } else {
                    System.out.println("Word " + word + " was not found");
                }
            } else {
                System.out.println("Unknown command");  
            }
        }

        System.out.println("Bye bye!");
    }
}
