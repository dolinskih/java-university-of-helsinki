
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First name:");
            String firstName = scanner.nextLine();

            if (firstName.length() == 0) {
                break;
            }

            System.out.println("Last name:");
            String lastName = scanner.nextLine();

            System.out.println("Identification number:");
            String identificationNumber = scanner.nextLine();

            PersonalInformation personalInformation = new PersonalInformation(firstName, lastName, identificationNumber);
            infoCollection.add(personalInformation);
        }

        for (PersonalInformation personalInformation : infoCollection) {
            System.out.println(personalInformation.getFirstName() + " " + personalInformation.getLastName());
        }
    }
}
