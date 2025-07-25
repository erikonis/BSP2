public class LecturerFilter implements RoleFilter {
    @Override
    public boolean shouldExclude(Person person) {
        return person.isLecturer() && !person.isStudent();
    }
}