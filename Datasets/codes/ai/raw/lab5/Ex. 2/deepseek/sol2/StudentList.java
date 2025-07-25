package exercise2;

public class StudentList {
    private String[] students;
    private int count;

    public StudentList(int size) {
        students = new String[size];
        count = 0;
    }

    public void addStudent(String name) {
        if (count < students.length) {
            students[count] = name;
            count++;
            System.out.println("Student added: " + name);
        } else {
            System.out.println("Warning: No space left to add a new student.");
        }
    }

    public void removeStudent(String name) {
        int index = searchStudent(name);
        if (index != -1) {
            shiftStudents(index);
            count--;
            System.out.println("Student removed: " + name);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    private void shiftStudents(int index) {
        for (int i = index; i < count - 1; i++) {
            students[i] = students[i + 1];
        }
        students[count - 1] = null;
    }

    public int searchStudent(String name) {
        for (int i = 0; i < count; i++) {
            if (students[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

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

    public void clearList() {
        for (int i = 0; i < count; i++) {
            students[i] = null;
        }
        count = 0;
        System.out.println("All students removed. List is now empty.");
    }
}