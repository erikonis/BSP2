import java.util.Scanner;

public class StudentListTestArrayList {
    public static void main(Stringargs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number of students: ");
        int capacity = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        StudentListArrayList studentList = new StudentListArrayList(capacity);

        while (true) {
            // ... (same menu and input handling as in StudentListTest.java)

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String addName = scanner.nextLine();
                    studentList.addStudent(addName);
                    break;
                // ... (rest of the cases - same as in StudentListTest.java)
            }
        }
    }
}