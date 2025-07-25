public class StudentList {
    private String[] students;
    private int count;

    public StudentList(int maxSize) {
        students = new String[Math.min(maxSize, 15)];
        count = 0;
    }

    public void addStudent(String name) {
        if (count < students.length) {
            students[count++] = name;
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Warning: Cannot add student. List is full!");
        }
    }

    public void removeStudent(String name) {
        int index = searchStudent(name);
        if (index != -1) {
            System.arraycopy(students, index + 1, students, index, count - index - 1);
            students[--count] = null;
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found in the list.");
        }
    }

    public int searchStudent(String name) {
        for (int i = 0; i < count; i++) {
            if (students[i].equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public void reportStudents() {
        if (count == 0) {
            System.out.println("No students registered yet.");
            return;
        }
        System.out.println("Registered Students:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
    }

    public void clearList() {
        for (int i = 0; i < count; i++) {
            students[i] = null;
        }
        count = 0;
        System.out.println("All students removed. Ready for new session.");
    }
}