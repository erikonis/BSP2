package lu.uni.programming1.lab7.exercise4;

public class Lecturer extends Filters {

    private Filters preFilter;

    public Lecturer(Filters preFilter) {
        this.preFilter = preFilter;
    }

    @Override
    public PersonList doFilter(PersonList personList){

        if(preFilter != null){
            personList = preFilter.doFilter(personList);
        }

        PersonList personLecturer = new PersonList(7);

        for (int j = 0; j < personList.i; j++) {
            Person OnePerson = personList.getOnePerson(j);
            if( OnePerson.isTeaches() == true){
                personLecturer.addPerson(personList.getPersonList()[j]);
            } 
        }
        return personLecturer;
    }
    
}
