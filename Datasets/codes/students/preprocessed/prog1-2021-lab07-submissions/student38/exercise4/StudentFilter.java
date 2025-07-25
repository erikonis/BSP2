public class StudentFilter extends Filter {

    public StudentFilter(Person[] persons) {
        super(persons);
    }

    @Override
    public void filter() {
        for (Person person : persons) {
            if (person.isTeaches() == false && person.isStudies() == true) {
                incrementArray();
            }
        }
        createArray(getArrayLenght());
        for (Person person : persons) {
            if (person.isTeaches() == false && person.isStudies() == true) {
                addPerson(person);
            }
        }

    }

}
