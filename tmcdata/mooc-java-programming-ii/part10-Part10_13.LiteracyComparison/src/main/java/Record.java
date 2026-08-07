public class Record implements Comparable<Record>{
    private String country;
    private int year;
    private String gender;
    private double literacyRate;

    public Record(String country, int year, String gender, double literacyRate) {
        this.country = country;
        this.year = year;
        if (gender.equals(" female (%)")) {
            this.gender = "female";
        } else {
            this.gender = "male";
        }
        this.literacyRate = literacyRate;
    }

    public double getLiteracyRate() {
        return this.literacyRate;
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.literacyRate;
    }

    @Override
    public int compareTo(Record another) {
        if (this.literacyRate == another.getLiteracyRate()) {
            return 0;
        }

        if (this.literacyRate > another.getLiteracyRate()) {
            return 1;
        }

        return -1;
    }
}
