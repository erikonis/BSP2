import java.util.Scanner;

public class StudentList {
    private String array[][], firstName, lastName;
    private int counter, rowID;

    StudentList(int counter, int rowID, String array[][], String firstName, String lastName) {
        this.counter = counter;
        this.rowID = rowID;
        this.array = array;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void showList(int capacity) {
        for (int i = 0; i < capacity; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("%s ", array[i][j]);
            }
            System.out.println();
        }
    }

    public void askName(Scanner scanner) {
        System.out.print("Enter first and last name (separated by space): ");
        firstName = scanner.next();
        lastName = scanner.next();
    }

    public void add(int capacity) {
        array[counter][0] = (array[counter][0] = firstName);
        array[counter][1] = (array[counter][1] = lastName);
        ++counter;
        showList(capacity);
        System.out.println();
    }

    public void search(int capacity) {
        for (int i = 0; i < capacity; i++) {
            for (int j = 0; j < 2; j++) {
                if (array[i][0].equals(firstName) && array[i][1].equals(lastName)) {
                    rowID = i;
                    i = capacity;
                    j = 2;
                }
            }
        }
    }

    public void remove(int capacity) {
        array[rowID][0] = null;
        array[rowID][1] = null;
        --counter;
        System.out.println("\nList after remove: ");
        showList(capacity);
    }

    public void shift(int capacity) {
        for (int i = rowID; i < capacity - 1; i++) {
            array[i][0] = array[i + 1][0];
            array[i][1] = array[i + 1][1];
        }
        array[capacity - 1][0] = null;
        array[capacity - 1][1] = null;
        System.out.println("\nList after shift: ");
        showList(capacity);
    }

    public void deleteList(int capacity) {
        for (int i = 0; i < capacity; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = null;
            }
        }
        counter = 0;
        showList(capacity);
    }

}
