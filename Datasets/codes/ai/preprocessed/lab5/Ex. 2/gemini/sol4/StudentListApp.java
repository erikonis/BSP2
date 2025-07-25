import java.util.Scanner;

public class StudentListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial capacity of the student list (max 15): ");
        int capacity = scanner.nextInt();
        scanner.nextLine();

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