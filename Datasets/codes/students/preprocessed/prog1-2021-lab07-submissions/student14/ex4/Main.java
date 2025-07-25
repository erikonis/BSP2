import java.util.ArrayList;
import java.util.Scanner;

public class main {
     public static void main(String[] args) {
        ArrayList<Person> listOfPeople = new ArrayList<Person>();

        Person cierra = new Person("Cierra", 1987, 3, 4, false, true);
        Person alden = new Person("Alden", 1998, 5, 12, true, true);
        Person thomas = new Person("Thomas", 1965, 12, 25, false, true);
        Person miranda = new Person("Miranda", 1974, 11, 29, false, true);
        Person brandy = new Person("Brandy", 1999, 6, 20, true, false);
        Person alvaro = new Person("Alvaro", 1963, 2, 18, false, true);
        Person maggie = new Person("Maggie", 2001, 8, 23, true, false);

        listOfPeople.add(cierra);
        listOfPeople.add(alden);
        listOfPeople.add(thomas);
        listOfPeople.add(miranda);
        listOfPeople.add(brandy);
        listOfPeople.add(alvaro);
        listOfPeople.add(maggie);

        Filter junior = new Junior("Junior Filter");
        Filter lecturer = new Lecturer("Lecturer Filter");
        Filter middle = new Middle("Middle Filter");
        Filter senior = new Senior("Senior Filter");
        Filter student = new Student("Student Filter");
        Filter ta = new TA("TA Filter");

        System.out.print("Original Array: [ ");
        for (int i = 0; i < listOfPeople.size(); i++) {
            if (listOfPeople.get(i) != null) {
                System.out.println(listOfPeople.get(i).toString());
            }
        }
        System.out.print("]");

        System.out.print("\n");

        System.out.println("List of filters:");
        System.out.println("1) " + junior.getName());
        System.out.println("2) " + lecturer.getName());
        System.out.println("3) " + middle.getName());
        System.out.println("4) " + senior.getName());
        System.out.println("5) " + student.getName());
        System.out.println("6) " + ta.getName());

        Scanner sc = new Scanner(System.in);
        boolean stop = false;
        ArrayList<Person> filteredSet = listOfPeople;

        while (!stop) {
            System.out
                    .println("Write down which filter you want to use or '0' to stop: (number in front of the filter)");
            int choice = sc.nextInt();

            switch (choice) {
            case 0:
                stop = true;
                break;

            case 1:
                filteredSet = junior.adaptArray(filteredSet, 18, 28);
                junior.printArray(filteredSet);
                break;

            case 2:
                filteredSet = lecturer.adaptArray(filteredSet, 0, 0);
                lecturer.printArray(filteredSet);
                break;

            case 3:
                filteredSet = middle.adaptArray(filteredSet, 28, 55);
                middle.printArray(filteredSet);
                break;

            case 4:
                filteredSet = senior.adaptArray(filteredSet, 0, 55);
                senior.printArray(filteredSet);
                break;

            case 5:
                filteredSet = student.adaptArray(filteredSet, 0, 0);
                student.printArray(filteredSet);
                break;

            case 6:
                filteredSet = ta.adaptArray(filteredSet, 0, 0);
                ta.printArray(filteredSet);
                break;

            default:
                System.out.println("There is no filter with this value in the list!");
                break;
            }
        }

        sc.close();
    }
}
