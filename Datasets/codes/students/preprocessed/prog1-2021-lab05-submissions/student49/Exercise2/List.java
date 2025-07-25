import java.util.Scanner;

public class List {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("The number of students for this week: ");
        int nr = scanner.nextInt();
        String fn, ln;
        Students l = new Students(nr);
        for (int i = 1; i <= nr; i++) {
            System.out.print("Student " + i + ":");
            fn = scanner.next();
            ln = scanner.next();
            l.student_add(fn, ln);
        }

        l.student_remove("Sara", "Vatavu");
        l.student_remove("Sarah", "Vatavu");
        l.student_add("Last", "Student");
        l.report_all();
        l.remove_all();
        l.report_all();

        scanner.close();

    }

}
