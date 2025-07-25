public class StudentList {
    private String[] students;
    private int count;

    // Constructor to initialize the array and counter
    public StudentList(int size) {
        students = new String[size];
        count = 0;
    }

    // Method to add a student
    public void addStudent(String name) {
        if (count < students.length) {
            students[count] = name;
            count++;
            System.out.println("Student added: " + name);
        } else {
            System.out.println("Warning: No space left to add a new student.");
        }
    }

    // Method to remove a student
    public void removeStudent(String name) {
        int index = searchStudent(name);
        if (index != -1) {
            // Step 2: Replace the student with null
            students[index] = null;

            // Step 3: Shift the following names
            for (int i = index; i < count - 1; i++) {
                students[i] = students[i + 1];
            }

            // Step 4: Remove the last element
            students[count - 1] = null;

            // Step 5: Decrement the counter
            count--;
            System.out.println("Student removed: " + name);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    // Method to search for a student
    public int searchStudent(String name) {
        for (int i = 0; i < count; i++) {
            if (students[i].equals(name)) {
                return i; // Return the index of the student
            }
        }
        return -1; // Student not found
    }

    // Method to report registered students
    public void reportStudents() {
        if (count == 0) {
            System.out.println("No students registered.");
        } else {
            System.out.println("Registered Students:");
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + students[i]);
            }
        }
    }

    // Method to clear the list for a new session
    public void clearList() {
        for (int i = 0; i < count; i++) {
            students[i] = null;
        }
        count = 0;
        System.out.println("All students removed. List is now empty.");
    }
}