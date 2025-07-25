package lu.uni.programming1.lab7.exercise4;

public abstract class Choose {
    
    private Person[] addPerson(Person[] people, Person person) {
        Person[] oldPeople = people;
        people = new Person[oldPeople.length+1];
        
        //flls people with its previous values
        for (int i = 0; i < oldPeople.length; i++) {
            people[i] = oldPeople[i];
        }

        people[people.length-1] = person;

        return people;
    }

    private boolean toCondition(Person person, int condition) {
        //condition 0 means students, 1 means lecturers, 2 means TAs
        //condition 3 means junior, 4 means middle, 5 means senior
        //to make a new filter one needs to assign a number to a condtion and add it to this method
        //and add a new method to the Filter class

        if (condition == 0) {
            return (person.isStudying() && !person.isTeaching());
        } else if (condition == 1) {
            return (person.isTeaching() && !person.isStudying());
        } else if (condition == 2) {
            return (person.isStudying() && person.isTeaching());
        } else if (condition == 3) {
            return (18 <= person.getAge() && person.getAge() < 28);
        } else if (condition == 4) {
            return (28 <= person.getAge() && person.getAge() < 55);
        } else {
            return (55 <= person.getAge());
        }
    }
    
    public Person[] getChoosen(Person[] SetOfPeople, int condition) {
        Person[] people = new Person[0];

        for (int i = 0; i < SetOfPeople.length; i++) {
            if (toCondition(SetOfPeople[i], condition)) {
                people = addPerson(people, SetOfPeople[i]);
            }
        }
        return people;
    }

    

}
