
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("literacy.csv"))
                .map(row -> row.split(","))
                .map(parts -> new Record(parts[3], Integer.valueOf(parts[4]), parts[2], Double.valueOf(parts[5])))
                .sorted()
                .forEach(record -> System.out.println(record));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
