public abstract class AgeRangeFilter implements Filter {
    protected int minAge;
    protected int maxAge;

    public AgeRangeFilter(int minAge, int maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    protected abstract boolean shouldExcludeByAge(Person person);

    @Override
    public Person[] filter(Person[] people) {
        if (people == null || people.length == 0) {
            return new Person[0];
        }
        Person[] filteredPeopleWithNulls = new Person[people.length];
        int count = 0;
        for (Person person : people) {
            if (!shouldExcludeByAge(person)) {
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