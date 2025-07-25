public class RoleFilters {
    public static class LecturerFilter implements Filter {
        @Override
        public Person[] filter(Person[] people) {
            return filterBy(people, p -> p.isTeacher() && !p.isStudent());
        }
    }
    
    public static class StudentFilter implements Filter {
        @Override
        public Person[] filter(Person[] people) {
            return filterBy(people, p -> p.isStudent() && !p.isTeacher());
        }
    }
    
    public static class TAFilter implements Filter {
        @Override
        public Person[] filter(Person[] people) {
            return filterBy(people, p -> p.isStudent() && p.isTeacher());
        }
    }
    
    private static Person[] filterBy(Person[] people, java.util.function.Predicate<Person> predicate) {
        Person[] result = new Person[people.length];
        int count = 0;
        for (Person p : people) {
            if (p != null && predicate.test(p)) {
                result[count++] = p;
            }
        }
        return compactArray(result, count);
    }
    
    private static Person[] compactArray(Person[] array, int count) {
        Person[] compact = new Person[count];
        System.arraycopy(array, 0, compact, 0, count);
        return compact;
    }
}