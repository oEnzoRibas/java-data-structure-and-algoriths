package Course.Lists.L2.Exs.ParkingLot.Classes;

import java.util.Calendar;

public class Date {
    private final Calendar calendar = Calendar.getInstance();

    protected int day, month, year, hour, minute, second;

    public Date(){
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.year = calendar.get(Calendar.YEAR);
    }

    public Date(int hour, int minute, int second) {
        this();
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Date(int hour, int minute, int second, int day, int month, int year) {
        this(hour, minute, second);
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(boolean realDate) {
        this();
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }

    public static String getMonthName(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
    }

    public String getDate() {
        return day + "/" + month + "/" + year+ " " + hour + ":" + minute + ":" + second;
    }

    /**
     * Calculates the difference in seconds between two Date objects.
     * @param other Date to compare with
     * @return Difference in seconds
     */
    public int difference(Date other) {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(this.year, this.month - 1, this.day, this.hour, this.minute, this.second);
        Calendar cal2 = Calendar.getInstance();
        cal2.set(other.year, other.month - 1, other.day, other.hour, other.minute, other.second);
        long diffMillis = Math.abs(cal1.getTimeInMillis() - cal2.getTimeInMillis());
        return (int) (diffMillis / 1000);
    }

    public int getMonth() {
        return month;
    }
}


