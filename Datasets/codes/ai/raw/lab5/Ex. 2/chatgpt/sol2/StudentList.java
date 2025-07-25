import java.util.ArrayList;

public class StudentList {
    private ArrayList<String> students;
    private int maxSize;

    public StudentList(int maxSize) {
        this.students = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public void addStudent(String name) {
        if (students.size() < maxSize) {
            students.add(name);
            System.out.println(name + " added to the list.");
        } else {
            System.out.println("Cannot add " + name + ". The list is full.");
        }
    }

    public void removeStudent(String name) {
        if (students.remove(name)) {
            System.out.println(name + " removed from the list.");
        } else {
            System.out.println(name + " not found.");
        }
    }

    public int searchStudent(String name) {
        return students.indexOf(name);
    }

    public void reportStudents() {
        System.out.println("Registered students:");
        if (students.isEmpty()) {
            System.out.println("No students registered.");
            return;
        }
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }
    }

    public void clearList() {
        students.clear();
        System.out.println("All students removed. The list is reset.");
    }
}
