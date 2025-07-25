public class StudentList {
    private String[] studentNames;
    private int studentCount;
    private int capacity;

    public StudentList(int capacity) {
        if (capacity > 0) {
            this.capacity = Math.min(capacity, 15); // Enforce maximum of 15
            this.studentNames = new String[this.capacity];
            this.studentCount = 0;
        } else {
            System.out.println("Invalid capacity. Student list not initialized.");
        }
    }

    public void addStudent(String fullName) {
        if (studentCount < capacity) {
            studentNames[studentCount++] = fullName;
            System.out.println(fullName + " added to the list.");
        } else {
            System.out.println("Warning: The student list is full. Cannot add " + fullName + ".");
        }
    }

    public void removeStudent(String fullName) {
        int index = searchStudent(fullName);
        if (index != -1) {
            studentNames[index] = null;

            for (int i = index; i < studentCount - 1; i++) {
                studentNames[i] = studentNames[i + 1];
            }

            if (studentCount > 0) {
                studentNames[studentCount - 1] = null;
                studentCount--;
                System.out.println(fullName + " removed from the list.");
            }
        } else {
            System.out.println(fullName + " not found in the list.");
        }
    }

    public int searchStudent(String fullName) {
        for (int i = 0; i < studentCount; i++) {
            if (studentNames[i] != null && studentNames[i].equals(fullName)) {
                return i;
            }
        }
        return -1;
    }

    public void reportRegisteredStudents() {
        if (studentCount > 0) {
            System.out.println("Registered Students (" + studentCount + "/" + capacity + "):");
            for (int i = 0; i < studentCount; i++) {
                System.out.println((i + 1) + ". " + studentNames[i]);
            }
        } else {
            System.out.println("No students are currently registered.");
        }
    }

    public void removeAllStudents() {
        java.util.Arrays.fill(studentNames, null);
        studentCount = 0;
        System.out.println("All students have been removed from the list for a new session.");
    }
}
