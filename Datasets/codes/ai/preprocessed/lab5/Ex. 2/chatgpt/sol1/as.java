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
            System.out.println(name + " added to the list.");
        } else {
            System.out.println("Cannot add " + name + ". The list is full.");
        }
    }

    public void removeStudent(String name) {
        int index = searchStudent(name);
        if (index == -1) {
            System.out.println(name + " not found.");
            return;
        }
        students[index] = null;
        for (int i = index; i < count - 1; i++) {
            students[i] = students[i + 1];
        }
        students[count - 1] = null;
        count--;
        System.out.println(name + " removed from the list.");
    }

    public int searchStudent(String name) {
        for (int i = 0; i < count; i++) {
            if (students[i] != null && students[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void reportStudents() {
        System.out.println("Registered students:");
        if (count == 0) {
            System.out.println("No students registered.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
    }

    public void clearList() {
        for (int i = 0; i < count; i++) {
            students[i] = null;
        }
        count = 0;
        System.out.println("All students removed. The list is reset.");
    }
}