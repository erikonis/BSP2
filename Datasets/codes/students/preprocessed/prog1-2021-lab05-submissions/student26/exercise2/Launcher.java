import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0, capacity, rowID = 0;
        String array[][], firstName = "", lastName = "", yes;

        System.out.print("Please enter the room capacity: ");
        capacity = scanner.nextInt();
        array = new String[capacity][2];
        StudentList studentList = new StudentList(counter, rowID, array, firstName, lastName);

        for (int i = 0; i < capacity; i++) {
            // add student ?
            System.out.print("Enter 'yes' if you want to add a student: ");
            yes = scanner.next();
            if (yes.equals("yes")) {
                studentList.askName(scanner);
                studentList.add(capacity);
                ++counter;
            }
            if (counter != 0) {
                // remove student ?
                System.out.print("Enter 'yes' if you want to remove a student: ");
                yes = scanner.next();
                if (yes.equals("yes")) {
                    studentList.askName(scanner);
                    studentList.search(capacity);
                    studentList.remove(capacity);
                    studentList.shift(capacity);
                    --i;
                }
                // delete list ?
                System.out.print("Enter 'yes' if you want to delete the student list: ");
                yes = scanner.next();
                if (yes.equals("yes")) {
                    System.out.print("Enter 'yes' if you are VERY SURE you want to delete the student list: ");
                    yes = scanner.next();
                    if (yes.equals("yes")) {
                        studentList.deleteList(capacity);
                        i = 0;
                    }
                }
            }
            // print list ?
            System.out.print("Enter 'yes' if you want to see the current student list: ");
            yes = scanner.next();
            if (yes.equals("yes")) {
                studentList.showList(capacity);
            }
            // want to finalize the list ?
            if (counter == capacity) {
                System.out.println("The class is now full. As a TA, it is time to start your course. :)");
            } else {
                System.out.print("Enter 'yes' if you want to finalize the student list: ");
                yes = scanner.next();
                if (yes.equals("yes")) {
                    i = capacity;
                }
            }
        }
        scanner.close();
    }
}
