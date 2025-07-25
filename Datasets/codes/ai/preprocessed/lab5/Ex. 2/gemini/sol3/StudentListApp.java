import java.util.Arrays;
import java.util.Scanner;

class StudentList {
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
            studentNames[index] = null; // Step 2: Replace with null

            // Step 3: Shift subsequent names
            for (int i = index; i < studentCount - 1; i++) {
                studentNames[i] = studentNames[i + 1];
            }

            // Step 4: Remove the last element
            if (studentCount > 0) {
                studentNames[studentCount - 1] = null;
                studentCount--; // Step 5: Decrement counter
                System.out.println(fullName + " removed from the list.");
            }
        } else {
            System.out.println(fullName + " not found in the list.");
        }
    }

    public int searchStudent(String fullName) {
        for (int i = 0; i < studentCount; i++) {
            if (studentNames[i] != null && studentNames[i].equals(fullName)) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
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
        Arrays.fill(studentNames, null);
        studentCount = 0;
        System.out.println("All students have been removed from the list for a new session.");
    }
}

public class StudentListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial capacity of the student list (max 15): ");
        int capacity = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        StudentList labGroup = new StudentList(capacity);

        while (true) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Add a student");
            System.out.println("2. Remove a student");
            System.out.println("3. Search for a student");
            System.out.println("4. Report registered students");
            System.out.println("5. Remove all students");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter the full name of the student to add: ");
                    String nameToAdd = scanner.nextLine();
                    labGroup.addStudent(nameToAdd);
                    break;
                case "2":
                    System.out.print("Enter the full name of the student to remove: ");
                    String nameToRemove = scanner.nextLine();
                    labGroup.removeStudent(nameToRemove);
                    break;
                case "3":
                    System.out.print("Enter the full name of the student to search for: ");
                    String nameToSearch = scanner.nextLine();
                    int index = labGroup.searchStudent(nameToSearch);
                    if (index != -1) {
                        System.out.println(nameToSearch + " found at position " + (index + 1) + ".");
                    } else {
                        System.out.println(nameToSearch + " not found in the list.");
                    }
                    break;
                case "4":
                    labGroup.reportRegisteredStudents();
                    break;
                case "5":
                    labGroup.removeAllStudents();
                    break;
                case "6":
                    System.out.println("Exiting the application.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}