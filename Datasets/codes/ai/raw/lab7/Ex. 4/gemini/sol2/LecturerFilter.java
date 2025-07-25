public enum LecturerFilter implements Filter {
    INSTANCE;

    @Override
    public Person[] filter(Person[] people) {
        return java.util.Arrays.stream(people)
                .filter(p -> p.isLecturer() && !p.isStudent())
                .toArray(Person[]::new);
    }
}
