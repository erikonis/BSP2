package lu.uni.programming1.lab7.exercise4;

public class LecturerFilter extends Filter {

    public LecturerFilter(Person[] persons) {
        super(persons);
    }

    @Override
    public void filter() {
        for (Person person : persons) {
            if (person.isTeaches() == true && person.isStudies() == false) {
                incrementArray();
            }
        }
        createArray(getArrayLenght());
        for (Person person : persons) {
            if (person.isTeaches() == true && person.isStudies() == false) {
                addPerson(person);
            }
        }
        
    }
    
}
