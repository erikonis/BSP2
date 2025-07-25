public class CompositeFilter implements Filter {
    private final Filter[] filters;

    public CompositeFilter(Filter... filters) {
        this.filters = filters;
    }

    @Override
    public Person[] filter(Person[] people) {
        Person[] result = people;
        for (Filter filter : filters) {
            result = filter.filter(result);
        }
        return result;
    }
}