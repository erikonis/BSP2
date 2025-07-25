package Exercises.exercise2;

import java.util.Scanner;

public class StudentList {

    String[] students;
    int counter;

    StudentList(int n) {
        students = new String[n];
        for (int i = 0; i < students.length; i++) {
            students[i] = " ";
        }
        counter = 0;
    }

    public void add(String name) {
        if (counter < students.length) {
            students[counter] = name;
            counter++;
        } else {
            System.out.println("there is no space left to add a new student");
        }
    }

    public void remove(String name) {

        int id = search(name);
        if (id > 0 || id == 0) {

            students[id] = " ";
            counter--;
            if (students.length - 1 - id > 0) {

                for (int i = id; i < students.length - 1; i++) {

                    String help = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = help;

                }
            } else {
                System.out.println("The student which you want to remove doesn´t exsist.");
            }

        }
    }

    public int search(String name) {
        int found = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                found = i;
            }
        }
        return found;
    }

    public void removeall() {
        for (int i = 0; i < students.length; i++) {
            students[i] = " ";
        }
        counter = 0;
    }

    public void report() {
        for (int i = 0; i < students.length; i++) {

            System.out.println((i + 1) + "= " + students[i]);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the number of Students on the list: ");
        int number = scanner.nextInt();
        StudentList studentlist = new StudentList(number);

        while (studentlist.counter > -1) {
            System.out.println("Do you want to 'add' a student or 'remove' a student or 'removeall' the students ");
            String answer = scanner.next();

            if (answer.equals("add")) {
                System.out.println("Enter the students first name: ");
                String first = scanner.next();
                System.out.println("Enter the students last name: ");
                String last = scanner.next();
                String name = first + " " + last;
                studentlist.add(name);
            }

            if (answer.equals("remove")) {
                System.out.println("Enter the unwanted students first name: ");
                String first = scanner.next();
                System.out.println("Enter the unwanted students last name: ");
                String last = scanner.next();
                String name = first + " " + last;
                studentlist.remove(name);
            }

            if (answer.equals("removeall")) {
                studentlist.removeall();
            }

            studentlist.report();

        }
        scanner.close();

    }

}