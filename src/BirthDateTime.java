import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);
        int day = 0;

        switch (month) {
            case 2: // February
                day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 29);
                break;
            case 4: case 6: case 9: case 11: // April, June, September, November
                day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 30);
                break;
            default: // January, March, May, July, August, October, December
                day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31);
                break;
        }

        int hour = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
        int minute = SafeInput.getRangedInt(in, "Enter your birth minute", 1, 59);

        System.out.println("\nYour birth date and time is: " + year + "-" + month + "-" + day + " " + hour + ":" + minute);
    }
}
