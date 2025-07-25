package lu.uni.programming1.lab5.exercise4;

public class Date {
    
    private int day;

    private int month;

    private int year;

    public boolean isLeapYear() {
        boolean leap = false;

        if (year % 4 == 0) {

            if (year % 100 == 0) {

                //divbisible by 400
                if (year % 400 == 0) {
                    leap = true;

                //divisible by 100 and not by 400
                } else {
                    leap = false;
                }
            
            //divisible by 4 and not by 100
            } else {
                leap = true;
            }
        }
        return leap;
    }

    public int daysInMonth() {
        int days;

        switch (month) {
            case 2:
                if (isLeapYear()) {
                    days = 29;
                } else {
                    days= 28;
                }
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;
            default:
                days = 31; 
                break;
        }

        return days;
    }

    Date(int day, int month, int year) {
        this.year = year;

        //sets month
        if (month <= 12 && month > 0) {
            this.month = month;
        } else {
            this.month = 1;
        }

        //sets day
        if (day > 0 && day <= daysInMonth()) {
            this.day = day;
        } else {
            this.day = 1;
        }
    }

    public void advance() {
        //advances day
        if (day != daysInMonth()) {
            day += 1;
        } else {
            day = 1;

            //advances month if necessary
            if (month != 12) {
                month += 1;
            } else {
                month = 1;

                //advances year if necessary
                year += 1;
            }
        }
    }

    public String format(boolean us, String delimiter) {
        if (us) {
            return String.format("%02d" + delimiter + "%02d" + delimiter  + "%d", month, day, year);
        } else {
            return String.format("%02d" + delimiter + "%02d" + delimiter  + "%d", day, month, year);
        }
    }
}
