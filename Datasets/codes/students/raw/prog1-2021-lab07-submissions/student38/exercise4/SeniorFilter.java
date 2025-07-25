package lu.uni.programming1.lab7.exercise4;

public class SeniorFilter extends Filter {

    public SeniorFilter(Person[] persons) {
        super(persons);
    }

    @Override
    public void filter() {
        for (Person person : persons) {
            if (person.getbYear() <= 1966) {
                incrementArray();
            }
        }
        createArray(getArrayLenght());
        for (Person person : persons) {
            if (person.getbYear() <= 1966) {
                addPerson(person);
            }
        }

    }

}
