import java.util.Arrays;

public class StudentList {
    private String[] students;
    private int count;

    public StudentList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive.");
        }
        this.students = new String[capacity];
        this.count = 0;
    }

    public void addStudent(String name) {
        if (count < students.length) {
            students[count] = name;
            count++;
        } else {
            System.out.println("Warning: Student list is full. Cannot add " + name + ".");
        }
    }

    public void removeStudent(String name) {
        int index = findStudentIndex(name);
        if (index != -1) {
            students[index] = null;
            shiftStudents(index);
            students[count - 1] = null; // Remove the last element
            count--;
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    private int findStudentIndex(String name) {
        for (int i = 0; i < count; i++) {
            if (students[i] != null && students[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    private void shiftStudents(int startIndex) {
        for (int i = startIndex; i < count - 1; i++) {
            students[i] = students[i + 1];
        }
    }

    public boolean searchStudent(String name) {
        return findStudentIndex(name) != -1;
    }

    public void reportStudents() {
        System.out.println("Registered Students:");
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }
    }

    public void clearList() {
        Arrays.fill(students, null);
        count = 0;
        System.out.println("Student list cleared for a new session.");
    }
}