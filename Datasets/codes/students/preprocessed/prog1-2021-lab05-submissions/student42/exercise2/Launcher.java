import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        int maxStudents;
        Scanner scann = new Scanner(System.in);

        System.out.println("Enter maximum number of students (NO MORE THAN 15!) :");
        maxStudents = scann.nextInt();

        /*
         * do { System.out.println("Enter maximum number of students :"); maxStudents =
         * scann.nextInt(); } while (maxStudents != 15);
         */
        scann.close();
        String[] array = new String[maxStudents];
        studentList list = new studentList(maxStudents, array);
        list.addStudent("Peter");
        list.addStudent("John");
        list.addStudent("Mark");
        list.report();
        list.remove("John");
        list.report();
        list.removeAll();
        list.addStudent("Catherine");
        list.addStudent("July");
        list.addStudent("Lucas");
        list.report();
        list.remove("Lucas");
        list.report();
    }
}