public class launcher {
    public static void main(String[] args) {
        person[] peopleToDisplay = { new person("Cierra", 1987, 3, 4, false, true),
                new person("Alden", 1998, 5, 12, true, true), new person("Thomas", 1965, 12, 25, false, true),
                new person("Miranda", 1974, 11, 29, false, true), new person("Brandy", 1999, 6, 20, true, false),
                new person("Alvaro", 1963, 2, 18, false, true), new person("Maggie", 2001, 8, 23, true, false) };
        listOfPeople l = new listOfPeople(peopleToDisplay);
        l.display();
        listOfPeople lecturers = l.getFilteredPeople(filter.Lecturer);
        System.out.println("\nLecturer Filte");
        lecturers.display();
        System.out.println("\nStudent Filter");
        l.getFilteredPeople(filter.Student).display();

        System.out.println("\nTA filter");
        l.getFilteredPeople(filter.TA).display();

        System.out.println("\nJunior Filter");
        l.getFilteredPeople(filter.Junior).display();

        System.out.println("\nMiddle Filter");
        l.getFilteredPeople(filter.Middle).display();

        System.out.println("\nSenior Filte");
        l.getFilteredPeople(filter.Senior).display();
    }
}