import java.util.*;
public class CalendarGenerator {
    public static void main(String[] args) {
        //Get the input user from
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month: ");
        int month = scanner.nextInt();
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();
        scanner.close();

        //Create a calendar object and set the month and year
        // Calendar object is created and with .getInstance method of the Calendar class,
        // which returns a Calendar object initialized with the current date and time in the default time zone.
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, 1);

        //Print the calendar header
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s\n",
                "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
        //Get the day of the week on which first day of the month or we can say a month start
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        //print the blank space for the days before the first day of the month
        for (int i=1; i < firstDayOfWeek; i++){
            System.out.printf("%10s"," ");
        }

        //Print the days of the month
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int day = 1; day<=daysInMonth; day++){

            System.out.printf("%10d", day);
            //to determine when to start a new row in the output
            if ((firstDayOfWeek + day-1)%7 == 0){
                System.out.println();
            }
        }
    }
}