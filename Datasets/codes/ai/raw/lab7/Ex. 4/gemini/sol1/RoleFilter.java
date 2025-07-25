
// RoleFilter.java
public abstract class RoleFilter implements Filter {
    protected abstract boolean shouldExclude(Person person);

    @Override
    public Person[] filter(Person[] people) {
        if (people == null || people.length == 0) {
            return new Person[0];
        }
        Person[] filteredPeopleWithNulls = new Person[people.length];
        int count = 0;
        for (Person person : people) {
            if (!shouldExclude(person)) {
                filteredPeopleWithNulls[count++] = person;
            }
        }
        return compactArray(filteredPeopleWithNulls, count);
    }

    private Person[] compactArray(Person[] arrayWithNulls, int actualSize) {
        Person[] compactedArray = new Person[actualSize];
        int index = 0;
        for (Person person : arrayWithNulls) {
            if (person != null) {
                compactedArray[index++] = person;
            }
        }
        return compactedArray;
    }
}