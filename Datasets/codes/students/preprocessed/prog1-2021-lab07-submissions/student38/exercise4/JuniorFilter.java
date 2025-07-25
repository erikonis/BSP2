public class JuniorFilter extends Filter {

    public JuniorFilter(Person[] persons) {
        super(persons);
    }

    @Override
    public void filter() {
        for (Person person : persons) {
            if (person.getbYear() <= 2003 && person.getbYear() > 1993) {
                incrementArray();
            }
        }
        createArray(getArrayLenght());
        for (Person person : persons) {
            if (person.getbYear() <= 2003 && person.getbYear() > 1993) {
                addPerson(person);
            }
        }
        
    }
    
}
