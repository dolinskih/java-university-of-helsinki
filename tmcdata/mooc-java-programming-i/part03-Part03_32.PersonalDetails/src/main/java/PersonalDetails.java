
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int sum = 0;
        int number = 0;

        while (true) {
            String text = scanner.nextLine();

            if (text.length() == 0) {
                break;
            }

            String[] words = text.split(",");

            if(words[0].length() > longestName.length()) {
                longestName = words[0];
            }

            sum += Integer.valueOf(words[1]);
            number++;
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double) sum / number);
    }
}
