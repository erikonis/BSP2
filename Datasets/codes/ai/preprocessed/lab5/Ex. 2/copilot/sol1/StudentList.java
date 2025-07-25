public class StudentList {
    private String[] students;
    private int count;

    public StudentList(int size) {
        students = new String[size];
        count = 0;
    }

    public void addStudent(String student) {
        if (count < students.length) {
            students[count] = student;
            count++;
        } else {
            System.out.println("No space available to add more students.");
        }
    }

    public void removeStudent(String student) {
        int index = searchStudent(student);
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

    public int searchStudent(String student) {
        for (int i = 0; i < count; i++) {
            if (students[i].equals(student)) {
                return i;
            }
        }
        return -1;
    }

    public void reportStudents() {
        System.out.println("Registered students:");
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }
    }

    public void removeAllStudents() {
        for (int i = 0; i < count; i++) {
            students[i] = null;
        }
        count = 0;
    }
}