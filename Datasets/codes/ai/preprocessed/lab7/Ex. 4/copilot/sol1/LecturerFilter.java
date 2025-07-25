public class LecturerFilter implements Filter {
    @Override
    public Person[] apply(Person[] people) {
        return Arrays.stream(people)
                     .filter(person -> person.isLecturer())
                     .toArray(Person[]::new);
    }
}