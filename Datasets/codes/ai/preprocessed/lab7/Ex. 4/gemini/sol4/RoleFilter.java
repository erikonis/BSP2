import java.util.Arrays;

public interface RoleFilter extends Filter {
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