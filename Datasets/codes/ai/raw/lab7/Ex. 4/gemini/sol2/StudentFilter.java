public enum StudentFilter implements Filter {
    INSTANCE;

    @Override
    public Person[] filter(Person[] people) {
        return java.util.Arrays.stream(people)
                .filter(p -> p.isStudent() && !p.isLecturer())
                .toArray(Person[]::new);
    }
}
