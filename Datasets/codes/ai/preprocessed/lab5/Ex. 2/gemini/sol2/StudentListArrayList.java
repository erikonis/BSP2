import java.util.ArrayList;

public class StudentListArrayList {
    private ArrayList<String> students;
    private int capacity;

    public StudentListArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive.");
        }
        this.students = new ArrayList<>();
        this.capacity = capacity;
    }

    public void addStudent(String name) {
        if (students.size() < capacity) {
            students.add(name);
        } else {
            System.out.println("Warning: Student list is full. Cannot add " + name + ".");
        }
    }

    public void removeStudent(String name) {
        if (students.remove(name)) {
            System.out.println(name + " removed from the list.");
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    public boolean searchStudent(String name) {
        return students.contains(name);
    }

    public void reportStudents() {
        System.out.println("Registered Students:");
        for (String student : students) {
            System.out.println(student);
        }
    }

    public void clearList() {
        students.clear();
        System.out.println("Student list cleared for a new session.");
    }
}