import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the maximum number of students allowed: ");
        int size = sc.nextInt();
        sc.nextLine(); // consume newline

        StudentList list = new StudentList(size);

        boolean running = true;
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Search student");
            System.out.println("4. Report students");
            System.out.println("5. Clear all students");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter full name of student to add: ");
                    String addName = sc.nextLine();
                    list.addStudent(addName);
                    break;
                case 2:
                    System.out.print("Enter full name of student to remove: ");
                    String removeName = sc.nextLine();
                    list.removeStudent(removeName);
                    break;
                case 3:
                    System.out.print("Enter full name of student to search: ");
                    String searchName = sc.nextLine();
                    int index = list.searchStudent(searchName);
                    if (index != -1) {
                        System.out.println(searchName + " is at position " + (index + 1));
                    } else {
                        System.out.println(searchName + " is not in the list.");
                    }
                    break;
                case 4:
                    list.reportStudents();
                    break;
                case 5:
                    list.clearAll();
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}