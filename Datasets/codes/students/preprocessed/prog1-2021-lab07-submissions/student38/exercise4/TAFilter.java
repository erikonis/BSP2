public class TAFilter extends Filter {

    public TAFilter(Person[] persons) {
        super(persons);
    }

    @Override
    public void filter() {
        for (Person person : persons) {
            if (person.isTeaches() == true || person.isStudies() == true) {
                incrementArray();
            }
        }
        createArray(getArrayLenght());
        for (Person person : persons) {
            if (person.isTeaches() == true || person.isStudies() == true) {
                addPerson(person);
            }
        }
        
    }
    
}
