import java.util.Calendar;
import java.util.GregorianCalendar;

class CalendarDemo {
    public static void main(String[] args) {

        Calendar cal = new GregorianCalendar();

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        System.out.println("Calendar and Gregorian Calendar");
        System.out.println("--------------------------------");

        System.out.println("Date : " + day + "/" + month + "/" + year);
        System.out.println("Time : " + hour + ":" + minute + ":" + second);

        System.out.println("Year  : " + year);
        System.out.println("Month : " + month);
        System.out.println("Day   : " + day);
    }
}
