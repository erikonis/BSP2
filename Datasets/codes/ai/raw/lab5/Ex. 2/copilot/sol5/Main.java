import java.util.Scanner;

public class Main {
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
