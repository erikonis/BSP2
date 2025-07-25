package lu.uni.programming1.lab5.exercise2;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        int maxStudents;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type the maximum number of students :");
        maxStudents = scanner.nextInt();
        scanner.close();
        String[] array = new String[maxStudents];
        StudentList list = new StudentList(maxStudents, array);
        list.addStudent("Sara Smith");
        list.addStudent("John Wick");
        list.addStudent("Jack Smith");
        list.addStudent("Bruce Lee");
        list.addStudent("Rosa Dasilva");
        list.report();
        list.remove("John Wick");
        list.report();
        list.removeAll();
        list.addStudent("Lily Hoffa");
        list.addStudent("Mara Loord");
        list.addStudent("John Wick");
        list.addStudent("Lionel Messi");
        list.addStudent("C.Ronaldo");
        list.report();
        list.remove("John Wick");
        list.report();

        System.out.println(list.search("Mara Loord"));

    }
}