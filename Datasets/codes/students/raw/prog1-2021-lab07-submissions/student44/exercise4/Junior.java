package lu.uni.programming1.lab7.exercise4;

public class Junior extends Filters {

    private Filters preFilter;

    public Junior(Filters preFilter) {
        this.preFilter = preFilter;
    }

    @Override
    public PersonList doFilter(PersonList personList){
       
        if(preFilter != null){
            personList = preFilter.doFilter(personList);
        }
        
        PersonList personJunior = new PersonList(7);
        int age = 0;

        for (int j = 0; j < personList.i; j++) {
            age = 2021 - personList.getPersonList()[j].getYearOfBirth();
            if((age >= 18) && (age <28)){
                personJunior.addPerson(personList.getPersonList()[j]);
            } 
        }
        return personJunior;
    }

}
