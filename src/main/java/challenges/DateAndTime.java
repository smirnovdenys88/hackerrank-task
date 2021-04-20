package challenges;

import java.util.Calendar;

public class DateAndTime {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();

        if (month == 1) {
            cal.set(year, 0, day);
        } else {
            cal.set(year, month - 1, day);
        }

        int dow = cal.get(Calendar.DAY_OF_WEEK);

        switch (dow) {
            case 1:
                return "SUNDAY";
            case 2:
                return "MONDAY";
            case 3:
                return "TUESDAY";
            case 4:
                return "WEDNESDAY";
            case 5:
                return "THURSDAY";
            case 6:
                return "FRIDAY";
            case 7:
                return "SATURDAY";
            default:
                System.out.println("GO To Hell....");
        }

        return null;
    }
}
