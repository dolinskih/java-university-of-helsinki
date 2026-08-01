public class Timer {
    private ClockHand hundredthsClockHand;
    private ClockHand secondsClockHand;

    public Timer() {
        this.hundredthsClockHand = new ClockHand(100);
        this.secondsClockHand = new ClockHand(60);
    }

    @Override
    public String toString() {
        return secondsClockHand + ":" + hundredthsClockHand;
    }

    public void advance() {
        this.hundredthsClockHand.advance();

        if (this.hundredthsClockHand.value() == 0) {
            this.secondsClockHand.advance();
        }
    }
}
