public class Date {
    private int day;
    private int month;
    private int year;

    public Date() { // Default constructor
        this(1, 1, 2000);
    }

    public Date(int day, int month, int year) { // Three-parameter constructor
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(Date other) { // Copy constructor
        this(other.getDay(), other.getMonth(), other.getYear());
    }

    public void setDay(int day) {
        if (day > 0 && day <= 31)
            this.day = day;
    } 

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12)
            this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        if (year > 0)
            this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("%02d-%02d-%04d", day, month, year);
    }

    
    public boolean equals(Date other) {
        if ((this.day == other.day) && (this.month == other.month) && (this.year == other.year)) {
            return true;
        }
        return false;
    }
}