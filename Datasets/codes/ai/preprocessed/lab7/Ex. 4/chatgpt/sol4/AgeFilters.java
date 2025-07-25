public class JuniorFilter implements Filter {
    public Person[] apply(Person[] people) {
        return FilterUtils.filterByCondition(people, p -> p.getAge() >= 18 && p.getAge() <= 28);
    }
}

public class MiddleFilter implements Filter {
    public Person[] apply(Person[] people) {
        return FilterUtils.filterByCondition(people, p -> p.getAge() > 28 && p.getAge() <= 55);
    }
}

public class SeniorFilter implements Filter {
    public Person[] apply(Person[] people) {
        return FilterUtils.filterByCondition(people, p -> p.getAge() > 55);
    }
}