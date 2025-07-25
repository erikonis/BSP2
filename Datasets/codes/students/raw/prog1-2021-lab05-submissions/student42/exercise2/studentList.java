package lu.uni.programming1.lab5.exercise2;

public class studentList {
    private int counter, maxStudents;
    private String[] array;

    public studentList(int maxStudents, String[] array) {
        this.counter = 0;
        this.maxStudents = maxStudents;
        this.array = array;
    }

    public void addStudent(String newStudent) {
        if (counter >= maxStudents) {
            System.out.println("Student list is full!");
        } else {
            array[counter] = newStudent;
            counter++;
        }
    }

    public void report() { // To display students
        System.out.println("This is the list of current students: ");
        for (int i = 0; i < counter; i++) {
            System.out.println(array[i]);
        }
    }

    public int search(String searchStudent) {
        // We will search for searchStudent. If we found a student, we will returen its
        // position in the array. If we did not find, we will return -1...
        int returnValue = -1;

        for (int i = 0; i < counter; i++) {
            if (array[i] == searchStudent) {
                returnValue = i;
            }
        }
        return returnValue;
    }

    public void remove(String removeStudent) {
        int removedIndex = search(removeStudent);
        if (removedIndex > 0) {
            array[removedIndex] = null; // We shift all the items one place
            for (int i = removedIndex; i < counter - 1; i++) {
                array[i] = array[i + 1];
            }
            counter--;
        } else {
            System.out.println("This student is not in our list to remove!!");
        }
    }

    public void removeAll() {
        this.counter = 0;
    }
}