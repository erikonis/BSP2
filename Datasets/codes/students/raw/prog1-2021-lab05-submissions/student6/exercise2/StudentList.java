package lu.uni.programming1.lab5.exercise2;

public class StudentList {
    // Initializing
    private int counter, maxStudents;
    private String[] array;

    public StudentList(int maxStudents, String[] array) {
        this.counter = 0;
        this.maxStudents = maxStudents;
        this.array = array;
    }

    public void addStudent(String newStudent) {
        if (counter >= maxStudents) {
            System.out.println("Student list is full!"); // List is full
        } else {
            array[counter] = newStudent;
            counter++;
            System.out.println("Student has been added to the list"); // Added successfully
        }

    }

    public void remove(String removeStudent) {
        int removeItem = search(removeStudent);
        if (removeItem > 0) {
            array[removeItem] = null; // Shift all the items one place
            for (int i = removeItem; i < counter - 1; i++) {
                array[i] = array[i + 1];
            }
            counter--;
        } else {
            System.out.println("Student has been removed from the list");
        }
    }

    // If there is a student, it will return it at
    // position in the array. If empty/not found will return -1
    public int search(String searchStudent) {
        int valueToReturn = -1;

        for (int i = 0; i < counter; i++) {
            if (array[i].equals(searchStudent)) {
                valueToReturn = i;
            }
        }
        return valueToReturn;
    }

    // display students
    public void report() {
        System.out.println("List of the current students: ");
        if (counter == 0) {
            System.out.println("List is empty");
        } else {
            for (int i = 0; i < counter; i++) {
                System.out.println(array[i]);
            }
        }

    }

    public void removeAll() {
        if (counter == 0) {
            System.out.println("Nothing to be removed"); // It's empty
        } else {
            counter = 0;
            for (int i = 0; i < array.length; i++) {
                array[i] = null;
            }
            System.out.println("Students have been removed"); // Were removed
        }
    }
}