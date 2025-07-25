public class TeachingAssistantFilter implements Filter {
    @Override
    public Person[] apply(Person[] people) {
        return filterPeople(people, p -> p.isTeacher() && p.isStudent());
    }
}