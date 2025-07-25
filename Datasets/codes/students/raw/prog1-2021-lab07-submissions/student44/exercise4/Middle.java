package lu.uni.programming1.lab7.exercise4;

public class Middle extends Filters {

    private Filters preFilter;

    public Middle(Filters preFilter) {
        this.preFilter = preFilter;
    }

    @Override
    public PersonList doFilter(PersonList personList){
       
        if(preFilter != null){
            personList = preFilter.doFilter(personList);
        }
        
        PersonList personMiddle = new PersonList(7);
        int age = 0;

        for (int j = 0; j < personList.i; j++) {
            age = 2021 - personList.getPersonList()[j].getYearOfBirth();
            if((age >= 28) && (age <=55)){
                personMiddle.addPerson(personList.getPersonList()[j]);
            } 
        }
        return personMiddle;
    }
    
}
