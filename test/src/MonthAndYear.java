import java.util.Objects;

public class MonthAndYear {
    private int month;
    private int year;
    private int hashCode;

    public MonthAndYear(int month, int year) {
        this.month = month;
        this.year = year;
        this.hashCode = Objects.hash(month, year);
    }
    public MonthAndYear() {

    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        MonthAndYear that = (MonthAndYear) o;
        return month == that.month && year == that.year;
    }

    @Override
    public int hashCode() {
        return this.hashCode;
    }
    public String inTTinMY() {
        return this.getMonth() +"/"+ this.getYear();
    }
}
