package lu.uni.programming1.lab7.exercise4;

import java.time.LocalDate;

public class Senior extends Filter {

    public Person[] filter(Person[] group) {
        LocalDate now = LocalDate.now();
        int n = 0;

        for (int i = 0; i < group.length; i++) {
            long years = java.time.temporal.ChronoUnit.YEARS.between(group[i].getBirthday(), now);
            if (years > 55) {
                n++;
            }
        }
        Person[] subgroup = new Person[n];

        n = 0;
        for (int i = 0; i < group.length; i++) {
            long years = java.time.temporal.ChronoUnit.YEARS.between(group[i].getBirthday(), now);
            if (years > 55) {
                subgroup[n++] = group[i];
            }
        }
        return subgroup;
    }
}
