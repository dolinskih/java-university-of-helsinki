
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = -1;
        while (true) {
            String text = scanner.nextLine();

            if (text.length() == 0) {
                break;
            }

            String[] words = text.split(",");
            int age = Integer.valueOf(words[1]);
            if(age > oldest) {
                oldest = age;
            }
        }

        System.out.println("Age of the oldest: " + oldest);
    }
}
