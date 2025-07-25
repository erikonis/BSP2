import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<String> students;

    public StudentListOptimized() {
        students = new ArrayList<>();
    }

    public void addStudent(String student) {
        if (students.size() < 15) {
            students.add(student);
        } else {
            System.out.println("No space available to add more students.");
        }
    }

    public void removeStudent(String student) {
        if (students.remove(student)) {
            System.out.println("Student removed.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public int searchStudent(String student) {
        return students.indexOf(student);
    }

    public void reportStudents() {
        System.out.println("Registered students:");
        for (String student : students) {
            System.out.println(student);
        }
    }

    public void removeAllStudents() {
        students.clear();
        System.out.println("All students removed.");
    }
}