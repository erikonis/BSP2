public class MiddleFilter implements Filter {
    @Override
    public Person[] apply(Person[] people) {
        return FilterUtils.filterByCondition(people, p -> p.getAge() > 28 && p.getAge() <= 55);
    }
}