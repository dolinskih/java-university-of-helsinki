
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first.contains() + "/100");
            System.out.println("Second: " + second.contains() + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                first.add(amount);
            } else if (command.equals("move")) {
                if (amount > first.contains()) {
                    if (second.contains() + first.contains() > 100) {
                        first.remove(100 - second.contains());
                        second.add(100);
                    } else {
                        second.add(first.contains());
                        first.remove(100);
                    }
                } else {
                    if (second.contains() + amount > 100) {
                        first.remove(100 - second.contains());
                        second.add(100);
                    } else {
                        first.remove(amount);
                        second.add(amount);
                    }
                }
            } else if (command.equals("remove")) {
                if (amount > second.contains()) {
                    second.remove(second.contains());
                } else {
                    second.remove(amount);
                }
            }
        }
    }

}
