public class StudentList {
    private String[] students;
    private int count;

    // Constructor
    public StudentList(int maxSize) {
        students = new String[maxSize];
        count = 0;
    }

    // Add a student (stack-style)
    public void addStudent(String name) {
        if (count >= students.length) {
            System.out.println("Cannot add " + name + ". Maximum number of students reached.");
            return;
        }
        students[count] = name;
        count++;
        System.out.println(name + " added to the list.");
    }

    // Remove a student by name
    public void removeStudent(String name) {
        int index = -1;

        // Step 1: Search for student
        for (int i = 0; i < count; i++) {
            if (students[i].equalsIgnoreCase(name)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println(name + " not found in the list.");
            return;
        }

        // Step 2: Remove student
        students[index] = null;

        // Step 3: Shift following names
        for (int i = index; i < count - 1; i++) {
            students[i] = students[i + 1];
        }

        // Step 4: Remove last element (duplicate)
        students[count - 1] = null;

        // Step 5: Decrement count
        count--;

        System.out.println(name + " removed from the list.");
    }

    // Search student: return index or -1
    public int searchStudent(String name) {
        for (int i = 0; i < count; i++) {
            if (students[i].equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    // Report registered students
    public void report() {
        System.out.println("\n--- Registered Students ---");
        if (count == 0) {
            System.out.println("No students registered.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + students[i]);
            }
        }
    }

    // Clear all students
    public void clear() {
        for (int i = 0; i < count; i++) {
            students[i] = null;
        }
        count = 0;
        System.out.println("All students removed. New session ready.");
    }
}