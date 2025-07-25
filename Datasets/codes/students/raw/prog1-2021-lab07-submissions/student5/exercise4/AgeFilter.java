package lu.uni.programming1.lab7.exercise4;

public class AgeFilter extends PersonFilter {

     int min, max;

    public AgeFilter(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Person[] myFilter(Person[] people) {
        int counter = 0;
        Person[] filter = new Person[people.length];

        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() >= min && people[i].getAge() < max) {
                filter[i] = people[i];
                counter++;
            }

        }
        for (int j = 0; j < filter.length; j++) {
            if (filter[j] == null) {
                for (int k = j; k < filter.length - 1; k++) {
                    filter[k] = filter[k + 1];
                }
            }
        }
        Person[] endFilter = new Person[counter];
        for (int x = 0; x < endFilter.length; x++) {
            endFilter[x] = filter[x];
        }

        return endFilter;
    }

}
