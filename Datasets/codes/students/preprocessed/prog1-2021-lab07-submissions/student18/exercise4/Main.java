
import java.time.LocalDate;

public class Main{
    public static void main(String[] args){
        PeopleList peopleList = new PeopleList(12);
        peopleList.init();
        peopleList.add(new Person("Max Musterman", LocalDate.of(2000, 5, 15), true, false));
        peopleList.print();

        peopleList.applyFilter(new Junior());
        peopleList.print();

        peopleList = new PeopleList(12);
        peopleList.init();
        
        peopleList.applyFilter(new Senior());
        peopleList.print();

        peopleList = new PeopleList(12);
        peopleList.init();

        peopleList.applyFilter(new Teacher());
        peopleList.applyFilter(new Student());
        peopleList.print();
    }
}