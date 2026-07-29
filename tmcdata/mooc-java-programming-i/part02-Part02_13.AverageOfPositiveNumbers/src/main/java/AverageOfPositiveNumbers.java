
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveNumbers = 0;
        int sum = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number > 0) {
                positiveNumbers = positiveNumbers + 1;
                sum = sum + number;
            }
        }

        if (positiveNumbers == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double) sum / positiveNumbers;
            System.out.println(average);
        }
    }
}
