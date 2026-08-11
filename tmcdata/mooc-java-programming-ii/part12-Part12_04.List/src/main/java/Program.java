
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your class here
        List<String> myList = new List<>();
        myList.add("Hello");
        myList.add("Mars");

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.value(i));
        }

        myList.remove("Mars");
        System.out.println(myList.contains("Mars"));
    }

}
