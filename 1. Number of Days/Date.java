import java.util.*;

class Date {
    private int _dd;
    private int _mm;
    private int _yyyy;

    public Date(int inputDate) {
        _yyyy = inputDate % 10000;
        _mm = inputDate / 10000 % 100;
        _dd = inputDate / 1000000;
    }

    public int getDay() {
        return _dd;
    }
    public int getMonth() {
        return _mm;
    }
    public int getYear() {
        return _yyyy;
    }
}

class Difference {
    private static final int[] cumulativeDays = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365}; //to find the number of days up to the current month
    
    public static int numDays(int date) {
        Date days = new Date(date);
        int totalNoLeap =  days.getYear() * 365;
        int totalYear = totalNoLeap + days.getYear() / 4 + days.getYear() / 400 - days.getYear() / 100; //account for leap years (+1 day every 4th, 400th years, excluding other 100th years)
        int totalDays = totalYear + cumulativeDays[days.getMonth()] + days.getDay();
        return totalDays;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first date (DDMMYYYY)");
        int date1 = numDays(input.nextInt());
        System.out.println("Enter your second date (DDMMYYYY)");
        int date2 = numDays(input.nextInt());
        int difference = date1 - date2;
        if (difference < 0) { //manual Math.abs
            difference = -difference;
        } else {}
        System.out.println(difference + 1); // +1 to include the current date
    }
}
