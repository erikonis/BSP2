// MiddleFilter.java
public class MiddleFilter extends AgeRangeFilter {
    public MiddleFilter() {
        super(29, 55);
    }

    @Override
    protected boolean shouldExcludeByAge(Person person) {
        return person.getAge() >= minAge && person.getAge() <= maxAge;
    }
}
