import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter max student list size: ");
        int size = input.nextInt();
        input.nextLine(); // consume newline

        StudentList list = new StudentList(size);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Add student");
            System.out.println("2 - Remove student");
            System.out.println("3 - Search student");
            System.out.println("4 - Print student list");
            System.out.println("5 - Clear list");
            System.out.println("6 - Exit");
            System.out.print("Enter choice: ");
            int choice = input.nextInt();
            input.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student full name: ");
                    String nameToAdd = input.nextLine();
                    list.addStudent(nameToAdd);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String nameToRemove = input.nextLine();
                    list.removeStudent(nameToRemove);
                    break;
                case 3:
                    System.out.print("Enter student name to search: ");
                    String nameToSearch = input.nextLine();
                    int index = list.searchStudent(nameToSearch);
                    if (index != -1) {
                        System.out.println(nameToSearch + " is at position " + (index + 1));
                    } else {
                        System.out.println(nameToSearch + " not found.");
                    }
                    break;
                case 4:
                    list.report();
                    break;
                case 5:
                    list.clearList();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}