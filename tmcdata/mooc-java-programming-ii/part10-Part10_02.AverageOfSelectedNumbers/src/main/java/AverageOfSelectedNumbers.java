
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> numbers = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String line = scanner.nextLine();

            if (line.equals("end")) {
                break;
            }

            numbers.add(line);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();

        if (choice.equals("n")) {
            double average = numbers.stream().mapToInt(s -> Integer.valueOf(s)).filter(s -> s < 0).average().getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        } else if (choice.equals("p")) {
            double average = numbers.stream().mapToInt(s -> Integer.valueOf(s)).filter(s -> s > 0).average().getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        }
    }
}
