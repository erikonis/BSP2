package lu.uni.programming1.lab5.exercise2;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the capacity of your classroom: ");
        int capacity = scanner.nextInt();

        StudentList list = new StudentList(capacity);

        System.out.print("Enter the first and last name of a student: ");

        list.addStudent(scanner.next(), scanner.next());

        list.addStudent("John", "Doe");
        list.addStudent("Jean", "Serien");
        list.addStudent("Guy", "Niol");
        list.addStudent("Marie", "Tournel");
        list.addStudent("Alain", "Terieur");

        list.getNames();

        list.removeStudent(3);

        System.out.println();

        list.getNames();

        System.out.println();

        list.addStudent("Alain", "Terieur");

        list.getNames();

        System.out.println();

        list.showStudent(3);

        scanner.close();
    }
}
