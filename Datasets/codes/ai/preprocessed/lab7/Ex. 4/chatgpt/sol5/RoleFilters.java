public class LecturerFilter implements PersonFilter {
    public Person[] apply(Person[] people) {
        return FilterUtils.filter(people, p -> p.isLecturer());
    }
}

public class StudentFilter implements PersonFilter {
    public Person[] apply(Person[] people) {
        return FilterUtils.filter(people, p -> p.isStudent());
    }
}

public class TAFilter implements PersonFilter {
    public Person[] apply(Person[] people) {
        return FilterUtils.filter(people, p -> p.isTA());
    }
}