public class Fitbyte {
    private double maximumHeartRate;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.maximumHeartRate = 206.3 - (0.711 * age);
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        return (maximumHeartRate - restingHeartRate) * percentageOfMaximum + restingHeartRate;
    }
}
