package lu.uni.programming1.lab7.exercise4;

public class AgeFilter extends PersonFilter {

    int min, max;

    public AgeFilter(int min, int max) {
        this.min = min;
        this.max = max;
    }

    //@Override
    public Person[] myFilter(Person[] people) {
        int counter = 0;
        Person[] filter = new Person[people.length];

        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() >= min && people[i].getAge() < max) {
                filter[counter] = people[i];
                counter++;
            }

        }

        Person[] endFilter = new Person[counter];
        for (int x = 0; x < endFilter.length; x++) {
            endFilter[x] = filter[x];
        }

        return endFilter;
    }

    @Override
    public String toString() {
        return "age min = " + min + " max = " + max;
    }

}
