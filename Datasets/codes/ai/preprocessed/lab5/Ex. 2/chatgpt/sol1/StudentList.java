import java.util.Scanner;

public class StudentList {
    private String[] students;
    private int count;

    public StudentList(int capacity) {
        students = new String[capacity];
        count = 0;
    }

    public void addStudent(String student) {
        if (count < students.length) {
            students[count++] = student;
            System.out.println(student + " added to the list.");
        } else {
            System.out.println("Cannot add student. List is full!");
        }
    }

    public void removeStudent(String student) {
        int index = searchStudent(student);
        if (index == -1) {
            System.out.println("Student not found!");
            return;
        }
        students[index] = null;
        for (int i = index; i < count - 1; i++) {
            students[i] = students[i + 1];
        }
        students[count - 1] = null;
        count--;
        System.out.println(student + " removed from the list.");
    }

    public int searchStudent(String student) {
        for (int i = 0; i < count; i++) {
            if (students[i].equals(student)) {
                return i;
            }
        }
        return -1;
    }

    public void reportStudents() {
        if (count == 0) {
            System.out.println("No students are registered.");
            return;
        }
        System.out.println("Registered students:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
    }

    public void clearList() {
        for (int i = 0; i < count; i++) {
            students[i] = null;
        }
        count = 0;
        System.out.println("All students removed. List is reset.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum number of students: ");
        int capacity = scanner.nextInt();
        scanner.nextLine();

        StudentList studentList = new StudentList(capacity);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Search student");
            System.out.println("4. Report students");
            System.out.println("5. Clear list");
            System.out.println("6. Exit");

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
                        System.out.println("Student not found.");
                    } else {
                        System.out.println("Student found at position: " + (index + 1));
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
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}