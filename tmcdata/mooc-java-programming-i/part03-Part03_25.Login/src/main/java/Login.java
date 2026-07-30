
import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> usernames = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();

        usernames.add("alex");
        usernames.add("emma");
        passwords.add("sunshine");
        passwords.add("haskell");

        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        if (!usernames.contains(username)) {
            System.out.println("Incorrect username or password!");
        } else {
            int userIndex = -1;
            for (int i = 0; i < usernames.size(); i++) {
                if (usernames.get(i).equals(username)) {
                    userIndex = i;
                    break;
                }
            }

            if (password.equals(passwords.get(userIndex))) {
                System.out.println("You have successfully logged in!");
            } else {
                System.out.println("Incorrect username or password!");
            }
        }
    }
}
