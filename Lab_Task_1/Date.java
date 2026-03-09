public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) { // Three-parameter constructor
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(Date other) { // Copy constructor
        this(other.getDay(), other.getMonth(), other.getYear());
    }

    public void setDay(int day) {
        this.day = day;
    } 

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("%02d-%02d-%04d", day, month, year);
    }
}