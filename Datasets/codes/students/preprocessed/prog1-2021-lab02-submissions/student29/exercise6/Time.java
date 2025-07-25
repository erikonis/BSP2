import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int hourFormat, hour, min, sec, addHour, addMin, addSec;
        String newHour, newMin, newSec, newAddHour, newAddSeconds, newAddMinutes;

        System.out.print("Type '0' for 24h format or '1' for 12 hour format: ");

        hourFormat = Math.min(1, Math.max(0, scanner.nextInt()));
        System.out.print("Please enter hour: ");
        if (hourFormat == 0) {
            hour = (scanner.nextInt()) % 24;
        } else {
            hour = (scanner.nextInt()) % 25;
        }
        

        System.out.print("Please enter minutes: ");
        min = (scanner.nextInt()) % 60;

        System.out.print("Please enter seconds: ");
        sec = (scanner.nextInt()) % 60;

        addSec = sec + 5;
        addMin = min;
        addHour = hour;

        if (addSec > 59) {
            ++addMin;
            addSec = addSec % 60;
        }
        if (addMin > 59) {
            ++addHour;
            addMin %= 60;
        }

        if (hour < 10) {
            newHour = "0" + hour;
        } else {
            newHour = "" + hour;
        }

        if (min < 10) {
            newMin = "0" + min;
        } else {
            newMin = "" + min;
        }

        if (sec < 10) {
            newSec = "0" + sec;
        } else {
            newSec = "" + sec;
        }
        if (addHour < 10) {
            newAddHour = "0" + addHour;
        } else {
            newAddHour = "" + addHour;
        }

        if (addMin < 10) {
            newAddMinutes = "0" + addMin;
        } else {
            newAddMinutes = "" + addMin;
        }

        if (addSec < 10) {
            newAddSeconds = "0" + addSec;
        } else {
            newAddSeconds = "" + addSec;
        }

        if (hourFormat == 0) {// 24 hour format
            System.out.println("Time: " + newHour + ":" + newMin + ":" + newSec);

            System.out.println("Advanced time: " + newAddHour + ":" + newAddMinutes + ":" + newAddSeconds);
        }

        else {// 12 hour format

            if (hour > 0 && hour < 13) { // this is am
                System.out.println("Time: " + newHour + ":" + newMin + ":" + newSec + "AM");
                if (addHour > 12) {
                    addHour -= 12;
                    if (addHour < 10) {
                        newAddHour = "0" + addHour;
                    } else {
                        newAddHour = "" + addHour;
                    }
                    System.out
                            .println("Advanced time: " + newAddHour + ":" + newAddMinutes + ":" + newAddSeconds + "PM");
                } else {
                    System.out
                            .println("Advanced time: " + newAddHour + ":" + newAddMinutes + ":" + newAddSeconds + "AM");
                }

            } else {// this is pm
                if (hour >= 13) {
                    hour -= 12;
                    addHour -= 12;
                    if (hour < 10) {
                        newHour = "0" + hour;
                    } else {
                        newHour = "" + hour;
                    }

                    if (min < 10) {
                        newMin = "0" + min;
                    } else {
                        newMin = "" + min;
                    }

                    if (sec < 10) {
                        newSec = "0" + sec;
                    } else {
                        newSec = "" + sec;
                    }
                    if (addHour < 10) {
                        newAddHour = "0" + addHour;
                    } else {
                        newAddHour = "" + addHour;
                    }

                    if (addMin < 10) {
                        newAddMinutes = "0" + addMin;
                    } else {
                        newAddMinutes = "" + addMin;
                    }

                    if (addSec < 10) {
                        newAddSeconds = "0" + addSec;
                    } else {
                        newAddSeconds = "" + addSec;
                    }
                }

                System.out.println("Time: " + newHour + ":" + newMin + ":" + newSec + " PM");

                if (addHour > 12) {
                    addHour -= 12;
                    if (addHour < 10) {
                        newAddHour = "0" + addHour;
                    } else {
                        newAddHour = "" + addHour;
                    }
                    System.out.println("Advanced time: " + newAddHour + ":" + newAddMinutes + ":" + newAddSeconds + "AM");
                } else {
                    System.out.println("Advanced time: " + newAddHour + ":" + newAddMinutes + ":" + newAddSeconds + "PM");
                }

            }
        }

        scanner.close();
    }
}