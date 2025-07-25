import java.util.Scanner;

public class StudentList {
    private String[] students;
    private int count;

    // Constructor to initialize the array and counter
    public StudentList(int size) {
        students = new String[size];
        count = 0;
    }

    // Method to add a student
    public void addStudent(String name) {
        if (count < students.length) {
            students[count] = name;
            count++;
        } else {
            System.out.println("Warning: No space to add more students.");
        }
    }

    // Method to remove a student
    public void removeStudent(String name) {
        int index = searchStudent(name);
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

    // Method to search for a student
    public int searchStudent(String name) {
        for (int i = 0; i < count; i++) {
            if (students[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    // Method to report the registered students
    public void reportStudents() {
        if (count == 0) {
            System.out.println("No students registered.");
        } else {
            System.out.println("Registered students:");
            for (int i = 0; i < count; i++) {
                System.out.println(students[i]);
            }
        }
    }

    // Method to remove all students
    public void removeAllStudents() {
        for (int i = 0; i < count; i++) {
            students[i] = null;
        }
        count = 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum number of students: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        StudentList studentList = new StudentList(size);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add a student");
            System.out.println("2. Remove a student");
            System.out.println("3. Search for a student");
            System.out.println("4. Report registered students");
            System.out.println("5. Remove all students");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter the student's name: ");
                    String nameToAdd = scanner.nextLine();
                    studentList.addStudent(nameToAdd);
                    break;
                case 2:
                    System.out.print("Enter the student's name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    studentList.removeStudent(nameToRemove);
                    break;
                case 3:
                    System.out.print("Enter the student's name to search: ");
                    String nameToSearch = scanner.nextLine();
                    int index = studentList.searchStudent(nameToSearch);
                    if (index != -1) {
                        System.out.println("Student found at index: " + index);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    studentList.reportStudents();
                    break;
                case 5:
                    studentList.removeAllStudents();
                    System.out.println("All students have been removed.");
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}