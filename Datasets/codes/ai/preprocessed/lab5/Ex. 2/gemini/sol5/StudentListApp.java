import java.util.Scanner;

public class StudentListApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial capacity (max 15): ");
        int capacity = input.nextInt();
        input.nextLine();

        StudentList roster = new StudentList(capacity);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Find Student");
            System.out.println("4. Display List");
            System.out.println("5. Clear List");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter student name: ");
                    String name = input.nextLine();
                    roster.add(name);
                    break;
                case "2":
                    System.out.print("Enter name to remove: ");
                    String nameToRemove = input.nextLine();
                    roster.remove(nameToRemove);
                    break;
                case "3":
                    System.out.print("Enter name to find: ");
                    String nameToFind = input.nextLine();
                    int index = roster.find(nameToFind);
                    if (index != -1) {
                        System.out.println("Student found at position " + (index + 1) + ".");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case "4":
                    roster.displayList();
                    break;
                case "5":
                    roster.clearList();
                    break;
                case "6":
                    System.out.println("Exiting application.");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}