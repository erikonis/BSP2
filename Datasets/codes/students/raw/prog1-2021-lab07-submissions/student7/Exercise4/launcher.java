package lu.uni.programming1.lab7.Exercise4;

public class launcher {
    public static void main(String[] args) {
        person[] Display = { new person("John", 1985, 4, 2, false, true),
                new person("Ahmad", 2000, 1, 11, true, true), new person("jany", 1978, 12, 25, false, true),
                new person("Alex", 1985, 12, 3, false, true), new person("Brandy", 2000, 5, 20, true, false),
                new person("Philip", 2002, 7, 12, false, true), new person("Maggie", 2004, 5, 23, true, false) };
        listOfPeople l = new listOfPeople(Display);
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