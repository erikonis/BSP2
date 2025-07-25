import java.util.Scanner;

public class StudentList {
    private String[] students;
    private int count;

    // Constructor
    public StudentList(int maxSize) {
        students = new String[maxSize];
        count = 0;
    }

    // Add a student
    public void addStudent(String name) {
        if (count < students.length) {
            students[count] = name;
            count++;
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Warning: Cannot add student. List is full!");
        }
    }

    // Remove a student
    public void removeStudent(String name) {
        int index = searchStudent(name);
        if (index != -1) {
            // Shift elements to fill the gap
            for (int i = index; i < count - 1; i++) {
                students[i] = students[i + 1];
            }
            students[count - 1] = null;
            count--;
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found in the list.");
        }
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

    // Report all registered students
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

    // Clear all students for new session
    public void clearList() {
        for (int i = 0; i < count; i++) {
            students[i] = null;
        }
        count = 0;
        System.out.println("All students removed. Ready for new session.");
    }

    // Test program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter maximum number of students (max 15): ");
        int maxSize = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        if (maxSize > 15) {
            System.out.println("Warning: Due to Corona restrictions, maximum is 15. Setting to 15.");
            maxSize = 15;
        }
        
        StudentList labSession = new StudentList(maxSize);
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Search student");
            System.out.println("4. View all students");
            System.out.println("5. Clear list for new session");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter student name (first last): ");
                    String name = scanner.nextLine();
                    labSession.addStudent(name);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.nextLine();
                    labSession.removeStudent(removeName);
                    break;
                case 3:
                    System.out.print("Enter student name to search: ");
                    String searchName = scanner.nextLine();
                    int position = labSession.searchStudent(searchName);
                    if (position != -1) {
                        System.out.println("Student found at position " + (position + 1));
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    labSession.reportStudents();
                    break;
                case 5:
                    labSession.clearList();
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}