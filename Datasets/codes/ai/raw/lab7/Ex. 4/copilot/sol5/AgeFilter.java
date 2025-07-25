public abstract class AgeFilter extends Filter {
    protected int minAge;
    protected int maxAge;

    public AgeFilter(int minAge, int maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    @Override
    public Person[] apply(Person[] people) {
        return filterPeople(people, person -> person.getAge() >= minAge && person.getAge() <= maxAge);
    }
}

class JuniorFilter extends AgeFilter {
    public JuniorFilter() {
        super(18, 28);
    }
}

class MiddleFilter extends AgeFilter {
    public MiddleFilter() {
        super(28, 55);
    }
}

class SeniorFilter extends AgeFilter {
    public SeniorFilter() {
        super(55, Integer.MAX_VALUE);
    }
}
