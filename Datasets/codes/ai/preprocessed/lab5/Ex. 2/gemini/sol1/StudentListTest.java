import java.util.Scanner;

public class StudentListTest {
    public static void main(Stringargs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number of students: ");
        int capacity = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        StudentList studentList = new StudentList(capacity);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Report Students");
            System.out.println("5. Clear List");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String addName = scanner.nextLine();
                    studentList.addStudent(addName);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.nextLine();
                    studentList.removeStudent(removeName);
                    break;
                case 3:
                    System.out.print("Enter student name to search: ");
                    String searchName = scanner.nextLine();
                    boolean found = studentList.searchStudent(searchName);
                    System.out.println(searchName + (found ? " found." : " not found."));
                    break;
                case 4:
                    studentList.reportStudents();
                    break;
                case 5:
                    studentList.clearList();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}