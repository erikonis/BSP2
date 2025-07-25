import java.util.Arrays;

public interface AgeFilter extends Filter {
    boolean shouldExclude(Person person);

    @Override
    default Person[] filter(Person[] people) {
        if (people == null || people.length == 0) {
            return new Person[0];
        }
        Person[] filteredPeople = new Person[people.length];
        int count = 0;
        for (Person person : people) {
            if (!shouldExclude(person)) {
                filteredPeople[count++] = person;
            }
        }
        return trimArray(filteredPeople, count);
    }

    private static Person[] trimArray(Person[] arr, int size) {
        if (size == arr.length) {
            return arr;
        }
        return Arrays.copyOf(arr, size);
    }
}

class JuniorFilter implements AgeFilter {
    @Override
    public boolean shouldExclude(Person person) {
        return person.getAge() >= 18 && person.getAge() <= 28;
    }
}

class MiddleFilter implements AgeFilter {
    @Override
    public boolean shouldExclude(Person person) {
        return person.getAge() >= 28 && person.getAge() <= 55;
    }
}

class SeniorFilter implements AgeFilter {
    @Override
    public boolean shouldExclude(Person person) {
        return person.getAge() > 55;
    }
}