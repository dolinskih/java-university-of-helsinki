
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = -1;
        String nameOfOldest = "";
        int currentPerson = 0;

        while (true) {
            String text = scanner.nextLine();

            if (text.length() == 0) {
                break;
            }

            String[] words = text.split(",");
            int age = Integer.valueOf(words[1]);

            if (age > oldest) {
                oldest = age;
                nameOfOldest = words[0];
            }

            currentPerson++;
        }

        System.out.println("Name of the oldest: " + nameOfOldest);
    }
}
