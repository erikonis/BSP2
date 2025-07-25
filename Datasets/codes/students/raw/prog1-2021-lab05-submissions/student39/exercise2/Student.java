package exercise2;

import java.util.ArrayList;
import java.util.Scanner;
public class Student{

///Main interface
    public static void main(String[] args) {
        while (true){
        System.out.println("1 – Add student");
        System.out.println("2 – Remove student");
        System.out.println("3 – Report all students");
        System.out.println("4 – Clear All");
	System.out.println("5 – To exit");
        System.out.println("Please enter your choice (1-5): ");
        Scanner sc= new Scanner(System.in);
        String line=sc.nextLine();
        StudentList MyObj = new StudentList();
        switch (line){
            case "1":
//              System.out.println("add student");
		MyObj.addStudent();
                break;
            case "2":
//                System.out.println("delete student");
                  MyObj.deleteStudent();
                break;
            case "3":
//                System.out.println("Report students");
                  MyObj.ReportAll();
                break;
            case "4":
                System.out.println("Clear All");
                 MyObj.RemoveAll();
	    case "5":
		System.exit(0); 
            default :
		System.out.println("Please enter your choice (1-5): ");      
 }

    }
    }
}

