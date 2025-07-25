public class MiddleFilter extends Filter {

    public MiddleFilter(Person[] persons) {
        super(persons);
    }

    @Override
    public void filter() {

        for (Person person : persons) {
            if (person.getbYear() <= 1993 && person.getbYear() > 1966) {
                incrementArray();
            }
        }
        createArray(getArrayLenght());
        for (Person person : persons) {
            if (person.getbYear() <= 1993 && person.getbYear() > 1966) {
                addPerson(person);
            }
        }

    }
    
}
