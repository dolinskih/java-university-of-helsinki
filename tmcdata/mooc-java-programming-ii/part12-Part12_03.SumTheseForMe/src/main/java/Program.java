
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here

    }

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        int lowerLimit = 0;
        if (fromWhere < array.length && fromWhere >= 0) {
            lowerLimit = fromWhere;
        }

        int upperLimit = array.length - 1;
        if (toWhere < array.length) {
            upperLimit = toWhere;
        }

        int sum = 0;

        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (array[i] >= smallest && array[i] <= largest) {
                sum += array[i];
            }
        }

        return sum;
    }

}
