public class LecturerFilter implements Filter {
    @Override
    public Person[] apply(Person[] people) {
        return FilterUtils.filterByCondition(people, p -> p.teaches() && !p.studies());
    }
}