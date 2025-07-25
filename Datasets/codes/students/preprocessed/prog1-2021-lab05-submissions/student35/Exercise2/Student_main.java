import java.util.Scanner;

public class Student_main {
    static int choice;
    static String fName, lName;
    static Scanner sc = new Scanner(System.in);
    static Students students = new Students(fName, lName);

    public static void main(String[] args) {
        Students.InitArray();
    }

    public static int NavigateTo() {
        System.out.println("Please provide an action :\n" + "1 - Display all students\n" + "2 - Add a student\n"
                + "3 - Remove a student\n" + "4 - Search for a student\n" + "5 - Report registered student\n"
                + "6 - Remove all students");

        choice = sc.nextInt();
        FetchChoice(choice);
        return choice;
    }

    private static void FetchChoice(int choice) {
        switch (choice) {
        case 1:
            Students.DisplayStudents();
            break;
        case 2:
            students.AddStudent();
            break;
        case 3:
            Students.RemoveStudent(fName, lName);
            break;
        case 4:
            students.SearchStudent(fName, lName);
            break;
        case 5:
            students.ReportUser();
            break;
        case 6:
            students.RemoveAll();
            break;
        default:
            System.out.println("Unknown choice.");
            break;
        }
    }
}
