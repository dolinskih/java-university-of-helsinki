import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();

            if (title.length() == 0) {
                break;
            }

            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            Book book = new Book(title, pages, publicationYear);
            books.add(book);
        }

        System.out.println("What information will be printed?");
        String choice = scanner.nextLine();

        if (choice.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (choice.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }
    }
}
