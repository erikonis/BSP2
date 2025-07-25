public class StudentFilter extends RoleFilter {
    @Override
    protected boolean shouldExclude(Person person) {
        return person.isStudent() && !person.isLecturer();
    }
}