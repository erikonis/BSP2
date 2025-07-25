public class JuniorFilter extends AgeRangeFilter {
    public JuniorFilter() {
        super(18, 28);
    }

    @Override
    protected boolean shouldExcludeByAge(Person person) {
        return person.getAge() >= minAge && person.getAge() <= maxAge;
    }
}