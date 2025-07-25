public class MiddleFilter implements Filter {
    @Override
    public Person[] apply(Person[] people) {
        return Arrays.stream(people)
                     .filter(person -> person.getAge() > 28 && person.getAge() <= 55)
                     .toArray(Person[]::new);
    }
}

