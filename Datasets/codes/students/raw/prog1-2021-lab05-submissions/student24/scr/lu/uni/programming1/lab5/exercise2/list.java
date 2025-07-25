package scr.lu.uni.programming1.lab5.exercise2;

import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentList sList = new StudentList(15);

        System.out.print("Opperation Value: 0 To Terminate Program; 1 To Add Student; 2 To remove Student; 3 To Print out list; 4 To empty list: ");
        int toDo = sc.nextInt();
        while(toDo != 0){
            if(toDo == 1){
                System.out.println("Adding Student");
                System.out.print("Enter Student's (only 1)First Name and (only 1)Last Name: ");
                String firstName = sc.next();
                String lastName = sc.next();
                Student s = new Student(firstName, lastName);
                sList.add(s);
            }else if(toDo == 2){
                System.out.println("Removing Student");
                System.out.print("Enter Student's (only 1)First Name and (only 1)Last Name: ");
                String firstName = sc.next();
                String lastName = sc.next();
                sList.remove(firstName, lastName);
            }else if(toDo == 3){
                sList.report();
            }else if(toDo == 4){
                sList.removeAll();
            }else{
                System.out.println("Enter valid Operation value");
            }
            System.out.print("Opperation Value: 0 To Terminate Program; 1 To Add Student; 2 To remove Student; 3 To Print out list; 4 To empty list: ");
            toDo = sc.nextInt();
        }

        sc.close();
    }
}
