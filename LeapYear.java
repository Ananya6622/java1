package java1;

public class LeapYear {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a year as a command-line argument.");
            return;
        }

        int year = Integer.parseInt(args[0]);

        if (year >= 1582) {
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Invalid input! Please enter a year greater than or equal to 1582.");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
