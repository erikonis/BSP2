public class StudentList {
    private String[] students;
    private int count;

    public StudentList(int size) {
        students = new String[size];
        count = 0;
    }

    // Add student at the end (stack-style)
    public void addStudent(String name) {
        if (count < students.length) {
            students[count++] = name;
            System.out.println(name + " has been added.");
        } else {
            System.out.println("Cannot add " + name + ": list is full.");
        }
    }

    // Remove student and shift others
    public void removeStudent(String name) {
        int index = -1;

        // Find student index
        for (int i = 0; i < count; i++) {
            if (students[i].equalsIgnoreCase(name)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println(name + " not found.");
            return;
        }

        // Remove and shift
        for (int i = index; i < count - 1; i++) {
            students[i] = students[i + 1];
        }
        students[count - 1] = null;
        count--;

        System.out.println(name + " has been removed.");
    }

    // Search for a student
    public int searchStudent(String name) {
        for (int i = 0; i < count; i++) {
            if (students[i].equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    // Print current students
    public void report() {
        if (count == 0) {
            System.out.println("No students registered.");
        } else {
            System.out.println("Registered students:");
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + students[i]);
            }
        }
    }

    // Reset the list
    public void clearList() {
        for (int i = 0; i < count; i++) {
            students[i] = null;
        }
        count = 0;
        System.out.println("Student list has been cleared.");
    }
}
