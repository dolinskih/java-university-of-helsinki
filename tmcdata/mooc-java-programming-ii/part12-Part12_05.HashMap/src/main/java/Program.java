
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can test the class here
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.add("hello", "witam");

        System.out.println(hashMap.get("hello"));
        hashMap.remove("hello");
        System.out.println(hashMap.get("hello"));
    }

}
