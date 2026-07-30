
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();

            if (text.length() == 0) {
                break;
            }

            String[] words = text.split(" ");

            for (int i = 0; i < words.length; i++) {
                System.out.println(words[i]);
            }
        }

    }
}
