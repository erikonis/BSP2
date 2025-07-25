package src.lu.uni.programming1.lab7.Exercise4;

public class launcher {
    public static void main(String[] args) {
        person[] peopleToDisplay = { new person("Cierra", 1987, 3, 4, false, true),
                new person("Alden", 1998, 5, 12, true, true), new person("Thomas", 1965, 12, 25, false, true),
                new person("Miranda", 1974, 11, 29, false, true), new person("Brandy", 1999, 6, 20, true, false),
                new person("Alvaro", 1963, 2, 18, false, true), new person("Maggie", 2001, 8, 23, true, false) };
        listOfPeople l = new listOfPeople(peopleToDisplay);
        l.display();
        listOfPeople lecturers = l.getFilteredPeople("Lecturer");
        System.out.println("\nLecturer Filte");
        lecturers.display();
        System.out.println("\nStudent Filter");
        l.getFilteredPeople("Student").display();

        System.out.println("\nTA filter");
        l.getFilteredPeople("TA").display();

        System.out.println("\nJunior Filter");
        l.getFilteredPeople("Junior").display();

        System.out.println("\nMiddle Filter");
        l.getFilteredPeople("Middle").display();

        System.out.println("\nSenior Filte");
        l.getFilteredPeople("Senior").display();
    }
}