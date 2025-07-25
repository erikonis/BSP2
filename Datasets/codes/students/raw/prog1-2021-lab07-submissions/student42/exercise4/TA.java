package lu.uni.programming1.lab7.exercise4;

public class TA extends Filter {

    public Person[] filter(Person[] group) {
        int n = 0;

        for (int i = 0; i < group.length; i++) {
            if (group[i].isStudies() && group[i].isTeaches()) {
                n++;
            }
        }
        Person[] subgroup = new Person[n];

        n = 0;
        for (int i = 0; i < group.length; i++) {
            if (group[i].isStudies() && group[i].isTeaches()) {
                subgroup[n++] = group[i];
            }
        }
        return subgroup;
    }
}
