import java.util.Scanner;

public class StudentListManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter maximum number of students (max 15): ");
        StudentList labSession = new StudentList(scanner.nextInt());
        scanner.nextLine(); // consume newline

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Search student");
            System.out.println("4. View all students");
            System.out.println("5. Clear list");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            switch (scanner.nextLine()) {
                case "1":
                    System.out.print("Enter student name: ");
                    labSession.addStudent(scanner.nextLine());
                    break;
                case "2":
                    System.out.print("Enter student name to remove: ");
                    labSession.removeStudent(scanner.nextLine());
                    break;
                case "3":
                    System.out.print("Enter student name to search: ");
                    int pos = labSession.searchStudent(scanner.nextLine());
                    System.out.println(pos == -1 ? "Student not found." : "Student found at position " + (pos + 1));
                    break;
                case "4":
                    labSession.reportStudents();
                    break;
                case "5":
                    labSession.clearList();
                    break;
                case "6":
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}