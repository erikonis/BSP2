package lu.uni.programming1.lab7.exercise4;

public class launch {

    public static void main(String[] args) {
        PersonsInSchool[] people = new PersonsInSchool[7];

        people[0] = new PersonsInSchool("Cierra", 1987, 3, 4, false, true);
        people[1] = new PersonsInSchool("Alden", 1998, 5, 12, true, true);
        people[2] = new PersonsInSchool("Thomas", 1965, 12, 25, false, true);
        people[3] = new PersonsInSchool("Miranda", 1974, 11, 29, false, true);
        people[4] = new PersonsInSchool("Brandy", 1999, 6, 20, true, false);
        people[5] = new PersonsInSchool("Alvaro", 1963, 2, 18, false, true);
        people[6] = new PersonsInSchool("Maggie", 2001, 8, 23, true, false);


        filter peopleinclass = new filter(people);
        peopleinclass.lecturerfilter();
        peopleinclass.studentfilter();
        peopleinclass.TAfilter();
        peopleinclass.juniorfilter();
        peopleinclass.middlefilter();
        peopleinclass.seniofilter();
    




    }
    
}
