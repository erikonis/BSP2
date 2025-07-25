public class SeniorFilter implements Filter {
    @Override
    public Person[] apply(Person[] people) {
        return FilterUtils.filterByCondition(people, p -> p.getAge() > 55);
    }
}
