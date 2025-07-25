package exercise2;

import java.util.Scanner;

public class StudentListTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the maximum number of students: ");
        int size = input.nextInt();
        input.nextLine(); // Consume newline

        StudentList list = new StudentList(size);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a student");
            System.out.println("2. Remove a student");
            System.out.println("3. Search for a student");
            System.out.println("4. Report registered students");
            System.out.println("5. Clear the list");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the student's full name: ");
                    String name = input.nextLine();
                    StudentList.addStudent(name);
                    break;
                case 2:
                    System.out.print("Enter the student's full name to remove: ");
                    String removeName = input.nextLine();
                    StudentList.removeStudent(removeName);
                    break;
                case 3:
                    System.out.print("Enter the student's full name to search: ");
                    String searchName = input.nextLine();
                    int index = StudentList.searchStudent(searchName);
                    if (index != -1) {
                        System.out.println("Student found at position: " + (index + 1));
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    StudentList.reportStudents();
                    break;
                case 5:
                    StudentList.clearList();
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}