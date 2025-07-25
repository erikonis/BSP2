	package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int hourType, hour, min, sec, HourAdded, MinAdded, SecAdded;
        String newHour, newMin, newSec, nHourAdded, nSecAdded, nMinAdded;

        System.out.print("Type '0' for 24-hour clock format or '1' for 12-hour clock format: ");

        hourType = Math.min(1, Math.max(0, scan.nextInt()));
        System.out.print("Please enter hour: ");
        if (hourType == 0) {
            hour = (scan.nextInt()) % 24;
        } else {
            hour = (scan.nextInt()) % 25;
        }
        

        System.out.print("Please enter minutes: ");
        min = (scan.nextInt()) % 60;

        System.out.print("Please enter seconds: ");
        sec = (scan.nextInt()) % 60;

        SecAdded = sec + 5;
        MinAdded = min;
        HourAdded = hour;

        if (SecAdded > 59) {
            ++MinAdded;
            SecAdded = SecAdded % 60;
        }
        if (MinAdded > 59) {
            ++HourAdded;
            MinAdded %= 60;
        }

        // leading zeroes
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
        // leading zeroes
        if (HourAdded < 10) {
            nHourAdded = "0" + HourAdded;
        } else {
            nHourAdded = "" + HourAdded;
        }

        if (MinAdded < 10) {
            nMinAdded = "0" + MinAdded;
        } else {
            nMinAdded = "" + MinAdded;
        }

        if (SecAdded < 10) {
            nSecAdded = "0" + SecAdded;
        } else {
            nSecAdded = "" + SecAdded;
        }

        if (hourType == 0) {// 24 hour format
            System.out.println("Time: " + newHour + ":" + newMin + ":" + newSec);

            System.out.println("Advanced time: " + nHourAdded + ":" + nMinAdded + ":" + nSecAdded);
        }

        else {// 12 hour format

            if (hour > 0 && hour < 13) { // AM
                System.out.println("Time: " + newHour + ":" + newMin + ":" + newSec + "AM");
                if (HourAdded > 12) {
                    HourAdded -= 12;
                    // leading zeroes
                    if (HourAdded < 10) {
                        nHourAdded = "0" + HourAdded;
                    } else {
                        nHourAdded = "" + HourAdded;
                    }
                    System.out
                            .println("Advanced time: " + nHourAdded + ":" + nMinAdded + ":" + nSecAdded + "PM");
                } else {
                    System.out
                            .println("Advanced time: " + nHourAdded + ":" + nMinAdded + ":" + nSecAdded + "AM");
                }

            } else {// PM
                if (hour >= 13) {
                    hour -= 12;
                    HourAdded -= 12;
                    // leading zeroes
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
                    // leading zeroes
                    if (HourAdded < 10) {
                        nHourAdded = "0" + HourAdded;
                    } else {
                        nHourAdded = "" + HourAdded;
                    }

                    if (MinAdded < 10) {
                        nMinAdded = "0" + MinAdded;
                    } else {
                        nMinAdded = "" + MinAdded;
                    }

                    if (SecAdded < 10) {
                        nSecAdded = "0" + SecAdded;
                    } else {
                        nSecAdded = "" + SecAdded;
                    }
                }

                System.out.println("Time: " + newHour + ":" + newMin + ":" + newSec + " PM");

                if (HourAdded > 12) {
                    HourAdded -= 12;
                    // leading zeroes
                    if (HourAdded < 10) {
                        nHourAdded = "0" + HourAdded;
                    } else {
                        nHourAdded = "" + HourAdded;
                    }
                    System.out.println("Advanced time: " + nHourAdded + ":" + nMinAdded + ":" + nSecAdded + "AM");
                } else {
                    System.out.println("Advanced time: " + nHourAdded + ":" + nMinAdded + ":" + nSecAdded + "PM");
                }

            }
        }

        scan.close();
    }
}
