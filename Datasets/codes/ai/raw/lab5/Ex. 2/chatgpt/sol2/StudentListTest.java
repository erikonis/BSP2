import java.util.Scanner;

public class StudentListTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the maximum number of students: ");
        int maxStudents = scanner.nextInt();
        scanner.nextLine(); 
        
        StudentList studentList = new StudentList(maxStudents);
        
        while (true) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Report Students");
            System.out.println("5. Clear List");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    studentList.addStudent(name);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    name = scanner.nextLine();
                    studentList.removeStudent(name);
                    break;
                case 3:
                    System.out.print("Enter student name to search: ");
                    name = scanner.nextLine();
                    int index = studentList.searchStudent(name);
                    if (index == -1) {
                        System.out.println(name + " is not on the list.");
                    } else {
                        System.out.println(name + " is at position " + (index + 1));
                    }
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
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
