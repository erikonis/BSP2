public class PersonSet {
    private final Person[] people;
    private int size;

    public PersonSet(int capacity) {
        people = new Person[capacity];
        size = 0;
    }

    public void add(Person person) {
        if (size < people.length) {
            people[size++] = person;
        }
    }

    public PersonSet filter(Filter filter) {
        PersonSet result = new PersonSet(size);
        for (int i = 0; i < size; i++) {
            if (filter.test(people[i])) {
                result.add(people[i]);
            }
        }
        return result;
    }

    public Person[] toArray() {
        Person[] result = new Person[size];
        System.arraycopy(people, 0, result, 0, size);
        return result;
    }

    public int size() { return size; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(people[i]).append("\n");
        }
        return sb.toString();
    }
}