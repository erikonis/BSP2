public class StudentFilter implements RoleFilter {
    @Override
    public boolean shouldExclude(Person person) {
        return person.isStudent() && !person.isLecturer();
    }
}