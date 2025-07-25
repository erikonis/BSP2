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
        } else {
            System.out.println("Warning: No space to add more students.");
        }
    }

    // Method to remove a student
    public void removeStudent(String name) {
        int index = searchStudent(name);
        if (index != -1) {
            students[index] = null;
            for (int i = index; i < count - 1; i++) {
                students[i] = students[i + 1];
            }
            students[count - 1] = null;
            count--;
        } else {
            System.out.println("Student not found.");
        }
    }

    // Method to search for a student
    public int searchStudent(String name) {
        for (int i = 0; i < count; i++) {
            if (students[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    // Method to report the registered students
    public void reportStudents() {
        if (count == 0) {
            System.out.println("No students registered.");
        } else {
            System.out.println("Registered students:");
            for (int i = 0; i < count; i++) {
                System.out.println(students[i]);
            }
        }
    }

    // Method to remove all students
    public void removeAllStudents() {
        for (int i = 0; i < count; i++) {
            students[i] = null;
        }
        count = 0;
    }
}