
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        this.random = new Random();

        while (this.numbers.size() < 7) {
            int newRandomNumber = this.random.nextInt(40) + 1;
            if (!this.containsNumber(newRandomNumber)) {
                this.numbers.add(newRandomNumber);
            } 
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        return this.numbers.contains(number);
    }
}

