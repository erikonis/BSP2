// SeniorFilter.java
public class SeniorFilter extends AgeRangeFilter {
    public SeniorFilter() {
        super(56, Integer.MAX_VALUE);
    }

    @Override
    protected boolean shouldExcludeByAge(Person person) {
        return person.getAge() > minAge;
    }
}