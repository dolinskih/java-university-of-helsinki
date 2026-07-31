
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                String[] data = row.split(",");
                int age = Integer.valueOf(data[1]);

                if (age == 1) {
                    System.out.println(data[0] + ", age: " + age + " year");
                } else {
                    System.out.println(data[0] + ", age: " + age + " years");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
