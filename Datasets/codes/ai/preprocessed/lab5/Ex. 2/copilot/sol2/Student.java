import java.util.Scanner;

public class Student {
    private String[] students;
    private int count;

    public StudentListAllInOne(int size) {
        students = new String[size];
        count = 0;
    }

    public void addStudent(String student) {
        if (count < students.length) {
            students[count] = student;
            count++;
        } else {
            System.out.println("No space available to add more students.");
        }
    }

    public void removeStudent(String student) {
        int index = searchStudent(student);
        if (index != -1) {
            students[index] = null;
            for (int i = index; i < count - 1; i++) {
                students[i] = students[i + 1];
            }
            students[count - 1] = null;
            count--;
        } else {
            System.out.println("Student not found.");
        }
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
        System.out.println("Registered students:");
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }
    }

    public void removeAllStudents() {
        for (int i = 0; i < count; i++) {
            students[i] = null;
        }
        count = 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the maximum number of students:");
        int size = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        StudentListAllInOne studentList = new StudentListAllInOne(size);

        while (true) {
            System.out.println("Choose an option: 1-Add, 2-Remove, 3-Search, 4-Report, 5-Remove All, 6-Exit");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (option) {
                case 1:
                    System.out.println("Enter student name:");
                    String studentToAdd = scanner.nextLine();
                    studentList.addStudent(studentToAdd);
                    break;
                case 2:
                    System.out.println("Enter student name to remove:");
                    String studentToRemove = scanner.nextLine();
                    studentList.removeStudent(studentToRemove);
                    break;
                case 3:
                    System.out.println("Enter student name to search:");
                    String studentToSearch = scanner.nextLine();
                    int index = studentList.searchStudent(studentToSearch);
                    if (index != -1) {
                        System.out.println("Student found at index: " + index);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    studentList.reportStudents();
                    break;
                case 5:
                    studentList.removeAllStudents();
                    System.out.println("All students removed.");
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}