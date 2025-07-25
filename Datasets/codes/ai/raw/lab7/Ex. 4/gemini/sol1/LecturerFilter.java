// LecturerFilter.java
public class LecturerFilter extends RoleFilter {
    @Override
    protected boolean shouldExclude(Person person) {
        return person.isLecturer() && !person.isStudent();
    }
}

