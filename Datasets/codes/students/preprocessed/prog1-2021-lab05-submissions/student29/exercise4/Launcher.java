import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //date
        System.out.print("Please enter the current day: ");
        int day = scanner.nextInt();
        System.out.print("Please enter the current month: ");
        int month = scanner.nextInt();
        System.out.print("Please enter the current year: ");
        int year = scanner.nextInt();

        //time
        System.out.print("Please enter the current hour: ");
        int hour = scanner.nextInt();
        System.out.print("Please enter the current minute: ");
        int minute = scanner.nextInt();
        System.out.print("Please enter the current second: ");
        int second = scanner.nextInt();

        Date date = new Date(day, month, year);
        Time time = new Time(hour, minute, second);

        DateTime dateTime = new DateTime(date, time);

        System.out.print("Do you use the us time? Answer with true or false: ");
        boolean us = scanner.nextBoolean();

        System.out.print("What delimiter do you use? ");
        String delimiter = scanner.next();

        byte choice = 1;

        while (choice != 0) {
            System.out.print("What do you want to do?\nEnter 0 to quit, 1 to get the time, 2 to know the time until midnight, 3 to get to time after midnight or 4 to advance the time by one second: ");
            choice = scanner.nextByte();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    dateTime.print(us, delimiter);
                    break;
                case 2:
                    System.out.println(dateTime.getTime().secondsUntilMidnight());
                    break;
                case 3:
                    System.out.println(dateTime.getTime().secondsSinceMidnight());
                    break;
                case 4:
                    dateTime.tick();
                    break;
                default:
                    System.out.println("Please enter a valid number!");
                    break;
            }
        }
        
        scanner.close();

    }
}
