import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Person> listofpeople = new ArrayList<Person>();

        Person person1 = new Person("Cierra", 1987, 3, 4, false, true);
        Person person2 = new Person("Alden", 1998, 5, 12, true, true);
        Person person3 = new Person("Thomas", 1965, 12, 25, false, true);
        Person person4 = new Person("Miranda", 1974, 11, 29, false, true);
        Person person5 = new Person("Brandy", 1999, 6, 20, true, false);
        Person person6 = new Person("Alvaro", 1963, 2, 18, false, true);
        Person person7 = new Person("Maggie", 2001, 8, 23, true, false);

        listofpeople.add(person1);
        listofpeople.add(person2);
        listofpeople.add(person3);
        listofpeople.add(person4);
        listofpeople.add(person5);
        listofpeople.add(person6);
        listofpeople.add(person7);

        Filter tafilter = new TAFilter();
        System.out.println("Only TAs: "+tafilter.execute(listofpeople)+"\n");

        Filter studentfilter = new StudentFilter();
        System.out.println("Only Students: "+studentfilter.execute(listofpeople)+"\n");
        
        Filter lecturerfilter = new LecturerFilter();
        System.out.println("Only Lecturers: "+lecturerfilter.execute(listofpeople)+"\n");
        Filter seniorfilter = new SeniorFilter();
        System.out.println("Only Senior Lecturers: "+seniorfilter.execute(lecturerfilter.execute(listofpeople))+"\n");

        Filter juniorfilter = new JuniorFilter();
        System.out.println("Only Juniors: "+juniorfilter.execute(listofpeople)+"\n");

        Filter middlefilter = new MiddleFilter();
        System.out.println("Only Middles: "+middlefilter.execute(listofpeople)+"\n");

        //I have one abstract class and one abstract method.
        //Different filter classes are extending the abstract class Filter.
        //The abstract method execute() is redefined by filter classes.
        //These abstract method has as arguments a list of people and return a new list of people.
        
        //My class hierarchy allows to have possibilty to add new filter quickly, to filter a filtered list, 
        //to initialize several lists applying what filters we want to each list.
    }
}
