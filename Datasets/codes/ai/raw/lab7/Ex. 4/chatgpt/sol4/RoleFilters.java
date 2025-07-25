public class LecturerFilter implements Filter {
    public Person[] apply(Person[] people) {
        return FilterUtils.filterByCondition(people, p -> p.teaches() && !p.studies());
    }
}

public class StudentFilter implements Filter {
    public Person[] apply(Person[] people) {
        return FilterUtils.filterByCondition(people, p -> p.studies() && !p.teaches());
    }
}

public class TAFilter implements Filter {
    public Person[] apply(Person[] people) {
        return FilterUtils.filterByCondition(people, p -> p.studies() && p.teaches());
    }
}