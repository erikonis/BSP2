public enum TAFilter implements Filter {
    INSTANCE;

    @Override
    public Person[] filter(Person[] people) {
        return java.util.Arrays.stream(people)
                .filter(Person::isTA)
                .toArray(Person[]::new);
    }
}