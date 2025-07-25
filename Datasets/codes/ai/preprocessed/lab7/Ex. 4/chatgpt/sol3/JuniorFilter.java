public class JuniorFilter implements Filter {
    @Override
    public Person[] apply(Person[] people) {
        return FilterUtils.filterByCondition(people, p -> p.getAge() >= 18 && p.getAge() <= 28);
    }
}