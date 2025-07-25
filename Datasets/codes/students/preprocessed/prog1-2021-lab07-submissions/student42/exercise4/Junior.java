import java.time.LocalDate;

public class Junior extends Filter {

    public Person[] filter(Person[] group) {
        LocalDate now = LocalDate.now();
        int n = 0;

        for (int i = 0; i < group.length; i++) {
            long years = java.time.temporal.ChronoUnit.YEARS.between(group[i].getBirthday(), now);
            if (years >= 18 && years < 28) {
                n++;
            }
        }
        Person[] subgroup = new Person[n];

        n = 0;
        for (int i = 0; i < group.length; i++) {
            long years = java.time.temporal.ChronoUnit.YEARS.between(group[i].getBirthday(), now);
            if (years >= 18 && years < 28) {
                subgroup[n++] = group[i];
            }
        }
        return subgroup;
    }

}
