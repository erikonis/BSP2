package exercise4;

import java.util.Calendar;

public class AgeFilter {

    private int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
    private int month = Calendar.getInstance().get(Calendar.MONTH);
    private int year = Calendar.getInstance().get(Calendar.YEAR);

    public boolean juniorFilter(int y, int m, int d) {
        boolean junior = false;

        int todayInDays = (int) (year * 365.25 + month * 30.42) + day;
        int birthdayInDays = (int) (y * 365.25 + m * 30.42) + d;

        int diffrence = todayInDays - birthdayInDays;

        if (diffrence >= 6574) {
            if (diffrence <= 10227) {
                junior = true;
            }
        }
        return junior;
    }

    public boolean middleFilter(int y, int m, int d) {
        boolean middle = false;

        int todayInDays = (int) (year * 365.25 + month * 30.42) + day;
        int birthdayInDays = (int) (y * 365.25 + m * 30.42) + d;

        int diffrence = todayInDays - birthdayInDays;

        if (diffrence >= 10227) {
            if (diffrence <= 20088) {
                middle = true;
            }
        }
        return middle;
    }

    public boolean seniorFilter(int y, int m, int d) {
        boolean senior = false;

        int todayInDays = (int) (year * 365.25 + month * 30.42) + day;
        int birthdayInDays = (int) (y * 365.25 + m * 30.42) + d;

        int diffrence = todayInDays - birthdayInDays;

        if (diffrence >= 2088) {
            senior = true;
        }
        return senior;
    }
}
