
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] command = input.split(" ");
            int amount = Integer.valueOf(command[1]);

            if (amount > 0) {
                if (command[0].equals("add")) {
                    if (amount + first > 100) {
                        first = 100;
                    } else {
                        first += amount;
                    }
                } else if (command[0].equals("move")) {
                    if (amount > first) {
                        if (second + first > 100) {
                            first -= 100 - second;
                            second = 100;
                        } else {
                            second += first;
                            first = 0;
                        }
                    } else {
                        if (second + amount > 100) {
                            first -= 100 - second;
                            second = 100;
                        } else {
                            second += amount;
                            first -= amount;
                        }
                    }
                } else if (command[0].equals("remove")) {
                    if (amount > second) {
                        second = 0;
                    } else {
                        second -= amount;
                    }
                }
            }

        }
    }

}
