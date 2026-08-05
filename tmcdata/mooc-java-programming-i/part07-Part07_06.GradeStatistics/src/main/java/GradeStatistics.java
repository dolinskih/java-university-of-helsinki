import java.util.ArrayList;

public class GradeStatistics {
    private ArrayList<Integer> grades;
    private int[] finalGrades;
    private int passingGrades;

    public GradeStatistics() {
        this.grades = new ArrayList<>();
        this.passingGrades = 0;
        this.finalGrades = new int[]{0, 0, 0, 0, 0, 0};
    }

    public void add(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grades.add(grade);

            if (grade >= 50) {
                this.passingGrades++;
            }

            gradeDistribution(grade);
        }
    }

    public double average(){
        if (this.grades.isEmpty()) {
            return -1;
        }

        int sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }

        return (double) sum / this.grades.size();
    }

    public double passingAverage() {
        if (this.grades.isEmpty()) {
            return -1;
        }

        if (this.passingGrades == 0) {
            return -1;
        }

        int sum = 0;
        for (int grade : this.grades) {
            if (grade >= 50) {
                sum += grade;
            }
        }

        return (double) sum / this.passingGrades;
    }

    public double passPercentage() {
        return (double) 100 * this.passingGrades / this.grades.size();
    }

    public void gradeDistribution(int points) {
        if (points >= 90) {
            this.finalGrades[5]++;
        } else if(points >= 80) {
            this.finalGrades[4]++;
        } else if(points >= 70) {
            this.finalGrades[3]++;
        } else if(points >= 60) {
            this.finalGrades[2]++;
        } else if(points >= 50) {
            this.finalGrades[1]++;
        } else {
            this.finalGrades[0]++;
        }
    }

    public int getNumberOfGrades(int grade){
        return this.finalGrades[grade];
    }
}
