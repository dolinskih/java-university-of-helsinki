import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private GradeStatistics gradeStatistics;

    public UserInterface(Scanner scanner, GradeStatistics gradeStatistics) {
        this.scanner = scanner;
        this.gradeStatistics = gradeStatistics;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int points = Integer.valueOf(this.scanner.nextLine());

            if (points == -1) {
                break;
            }

            this.gradeStatistics.add(points);
        }

        System.out.println("Point average (all): " + this.gradeStatistics.average());

        double passingAverage = this.gradeStatistics.passingAverage();
        if (passingAverage == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + passingAverage);
        }
        System.out.println("Pass percentage: " + this.gradeStatistics.passPercentage());
        System.out.println("Grade distribution:");
        gradeDistribution();
    }

    public void gradeDistribution() {
        for (int i = 5; i >= 0; i--) {
            if (i == 5) {
                System.out.print("5: ");
            } else {
                System.out.print("\n" + i + ": ");
            }
            printStars(i);
        }

    }

    public void printStars(int grade) {
        for (int i = 0; i < this.gradeStatistics.getNumberOfGrades(grade); i++) {
            System.out.print("*");
        }
    }
}
