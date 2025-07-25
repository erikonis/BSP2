public class StudentFilter implements Filter {
    @Override
    public Person[] apply(Person[] people) {
        return FilterUtils.filterByCondition(people, p -> p.studies() && !p.teaches());
    }
}
