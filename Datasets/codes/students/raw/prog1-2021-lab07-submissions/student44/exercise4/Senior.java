package lu.uni.programming1.lab7.exercise4;

public class Senior extends Filters {

    private Filters preFilter;

    public Senior(Filters preFilter) {
        this.preFilter = preFilter;
    }

    @Override
    public PersonList doFilter(PersonList personList){
       
        if(preFilter != null){
            personList = preFilter.doFilter(personList);
        }
        
        PersonList personSenior = new PersonList(7);
        int age = 0;

        for (int j = 0; j < personList.i; j++) {
            age = 2021 - personList.getPersonList()[j].getYearOfBirth();
            if(age > 55){
                personSenior.addPerson(personList.getPersonList()[j]);
            } 
        }
        return personSenior;
    }
    
}
