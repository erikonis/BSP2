public class JuniorFilter implements PersonFilter {
    public Person[] apply(Person[] people) {
        return FilterUtils.filter(people, p -> p.getAge() >= 18 && p.getAge() < 28);
    }
}

public class MiddleFilter implements PersonFilter {
    public Person[] apply(Person[] people) {
        return FilterUtils.filter(people, p -> p.getAge() >= 28 && p.getAge() <= 55);
    }
}

public class SeniorFilter implements PersonFilter {
    public Person[] apply(Person[] people) {
        return FilterUtils.filter(people, p -> p.getAge() > 55);
    }
}