
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] command = input.split(" ");
            int amount = Integer.valueOf(command[1]);

            if (command[0].equals("add")) {
                first.add(amount);
            } else if (command[0].equals("move")) {
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
                        second.add(100);;
                    } else {
                        second.add(amount);
                        first.remove(amount);
                    }
                }
            } else if (command[0].equals("remove")) {
                second.remove(amount);
            }

        }
    }

}
