package lu.uni.programming1.lab7.exercise4;

public class Student extends Filters {

    private Filters preFilter;

    public Student (Filters preFilter) {
        this.preFilter = preFilter;
    }

    @Override
    public PersonList doFilter(PersonList personList){

        if(preFilter != null){
            personList = preFilter.doFilter(personList);
        }

        PersonList personStudents = new PersonList(7);

        for (int j = 0; j < personList.i; j++) {
            Person OnePerson = personList.getOnePerson(j);
            if( OnePerson.isStudies() == true){
                personStudents.addPerson(personList.getPersonList()[j]);
            } 
        }
        return personStudents;
    }
    
}
