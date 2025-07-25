public class StudentList {
    private String[] students;
    private int count;

    // Constructor: initialize array and set count to 0
    public StudentList(int size) {
        students = new String[size];
        count = 0;
    }

    // Add a student (stack-style: at the end)
    public void addStudent(String name) {
        if (count < students.length) {
            students[count] = name;
            count++;
            System.out.println(name + " has been added.");
        } else {
            System.out.println("Cannot add " + name + ". The list is full.");
        }
    }

    // Remove a student by name
    public void removeStudent(String name) {
        int index = searchStudent(name);
        if (index == -1) {
            System.out.println(name + " not found in the list.");
            return;
        }

        // Step 2: Remove the student by replacing it with null
        students[index] = null;

        // Step 3: Shift remaining students
        for (int i = index; i < count - 1; i++) {
            students[i] = students[i + 1];
        }

        // Step 4: Remove the last element (set to null)
        students[count - 1] = null;

        // Step 5: Decrement counter
        count--;

        System.out.println(name + " has been removed.");
    }

    // Search for a student by name
    public int searchStudent(String name) {
        for (int i = 0; i < count; i++) {
            if (students[i].equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    // Report all registered students
    public void reportStudents() {
        System.out.println("Registered students:");
        if (count == 0) {
            System.out.println("No students currently registered.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + students[i]);
            }
        }
    }

    // Remove all students
    public void clearAll() {
        for (int i = 0; i < count; i++) {
            students[i] = null;
        }
        count = 0;
        System.out.println("All students removed. Ready for a new session.");
    }
}