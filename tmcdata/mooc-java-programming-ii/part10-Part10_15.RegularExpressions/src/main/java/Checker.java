

public class Checker {
    public boolean isDayOfWeek(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        }

        return false;
    }

    public boolean allVowels(String string) {
        if (string.matches("(a|e|i|o|u)*")) {
            return true;
        }

        return false;
    }

    public boolean timeOfDay(String string) {
        if (string.matches("[0-2]{1}[0-9]{1}:[0-5]{1}[0-9]{1}:[0-5]{1}[0-9]{1}")) {
            String[] timeString =  string.split(":");
            int hour = Integer.valueOf(timeString[0]);
            int minute = Integer.valueOf(timeString[1]);
            int second = Integer.valueOf(timeString[2]);

            if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59) {
                return true;
            }
        }

        return false;
    }
}
