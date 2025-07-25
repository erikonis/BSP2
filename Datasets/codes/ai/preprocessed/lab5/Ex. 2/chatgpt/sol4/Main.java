import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter maximum student capacity: ");
        int max = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        StudentList list = new StudentList(max);

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Search student");
            System.out.println("4. Report all students");
            System.out.println("5. Clear list");
            System.out.println("6. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter full name to add: ");
                    String addName = scanner.nextLine();
                    list.addStudent(addName);
                    break;
                case 2:
                    System.out.print("Enter full name to remove: ");
                    String removeName = scanner.nextLine();
                    list.removeStudent(removeName);
                    break;
                case 3:
                    System.out.print("Enter full name to search: ");
                    String searchName = scanner.nextLine();
                    int index = list.searchStudent(searchName);
                    if (index == -1) {
                        System.out.println(searchName + " not found.");
                    } else {
                        System.out.println(searchName + " is at position " + (index + 1));
                    }
                    break;
                case 4:
                    list.report();
                    break;
                case 5:
                    list.clear();
                    break;
                case 6:
                    System.out.println("Exiting. Bye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}