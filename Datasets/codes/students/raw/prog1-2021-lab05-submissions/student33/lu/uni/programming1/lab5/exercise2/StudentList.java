package lu.uni.programming1.lab5.exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> student = new ArrayList<String>();

        // 1
        System.out.println("Enter student's name: ");
        student.add(scanner.nextLine());
        // 2
        System.out.println("Enter student's name: ");
        student.add(scanner.nextLine());
        // 3
        System.out.println("Enter student's name: ");
        student.add(scanner.nextLine());
        // 4
        System.out.println("Enter student's name: ");
        student.add(scanner.nextLine());
        // 5
        System.out.println("Enter student's name: ");
        student.add(scanner.nextLine());
        // 6
        System.out.println("Enter student's name: ");
        student.add(scanner.nextLine());
        // 7
        System.out.println("Enter student's name: ");
        student.add(scanner.nextLine());
        // 8
        System.out.println("Enter student's name: ");
        student.add(scanner.nextLine());
        // 9
        System.out.println("Enter student's name: ");
        student.add(scanner.nextLine());
        // 10
        System.out.println("Enter student's name: ");
        student.add(scanner.nextLine());
        // 11
        System.out.println("Enter student's name: ");
        student.add(scanner.nextLine());
        // 12
        System.out.println("Enter student's name: ");
        student.add(scanner.nextLine());
        // 13
        System.out.println("Enter student's name: ");
        student.add(scanner.nextLine());
        // 14
        System.out.println("Enter student's name: ");
        student.add(scanner.nextLine());
        // 15
        System.out.println("Enter student's name: ");
        student.add(scanner.nextLine());

        
        // Displaying
        System.out.println("Original List:");
        for(String str:student)
        System.out.println(str);


        // Remove
        System.out.println("Remove student: ");
        student.remove(scanner.nextInt());

        // Display
        System.out.println("List after removing student:");
        for(String str:student)
        System.out.println(str);
        
        // Display final
        System.out.println("Final list:");
        for(String str:student)
        System.out.println(str);

        scanner.close();
    }
}
