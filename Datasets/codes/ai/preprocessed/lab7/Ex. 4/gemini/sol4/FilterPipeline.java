public class FilterPipeline implements Filter {
    private Filter[] filters;

    public FilterPipeline(Filter... filters) {
        this.filters = filters;
    }

    @Override
    public Person[] filter(Person[] people) {
        Person[] current = people;
        for (Filter filter : filters) {
            current = filter.filter(current);
        }
        return current;
    }
}