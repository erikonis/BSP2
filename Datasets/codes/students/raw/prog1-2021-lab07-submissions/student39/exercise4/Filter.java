package lu.uni.programming1.lab7.exercise4;

public class Filter extends Choose {

    public Filter() {
    }

    public Person[] student(Person[] people) {
        return getChoosen(people, 0);
    }

    public Person[] lecturer(Person[] people) {
        return getChoosen(people, 1);
    }

    public Person[] ta(Person[] people) {
        return getChoosen(people, 2);
    }

    public Person[] junior(Person[] people) {
        return getChoosen(people, 3);
    }

    public Person[] middlePersons(Person[] people) {
        return getChoosen(people, 4);
    }

    public Person[] senior(Person[] people) {
        return getChoosen(people, 5);
    }
    
}
