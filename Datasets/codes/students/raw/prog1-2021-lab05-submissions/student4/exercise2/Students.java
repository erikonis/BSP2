package lu.uni.programming1.lab5.exercise2;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Thread.*;

public class Students {

    private static int choice;
    private String firstName,lastName;
    private static String[] studentNames;
    private static Scanner scan = new Scanner(System.in);
    private static Student_main student_main = new Student_main();
    private static int i = -1;

    public Students(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static String[] InitArray(){ //fired once
        System.out.println("Please input a number for the array length :");
        int c = scan.nextInt();
        studentNames = new String[c];
        student_main.NavigateTo();

        return studentNames;
    }

    public static void DisplayStudents(){
        System.out.println("List of students :");
        for(int i = 0; i < studentNames.length; i++){
            System.out.println("["+i+"]\t" + studentNames[i]);
        }
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        student_main.NavigateTo();
    }

    public String[] AddStudent(){
        System.out.println("Please enter the firstname of the student : ");
        firstName = scan.next();
        System.out.println("Please enter the lastname of the student :");
        lastName = scan.next();
        i++;
        try{
            studentNames[i] = firstName + " " + lastName;
        }
        catch (Exception e){
            System.out.println("Student exception : " + e);
        }
        finally {
            System.out.println("Student added with success.\n" +
                    "Students ID : " + i +
                    "\nFirstname : " + firstName +
                    "\nLastname : " + lastName);
            try {
                sleep(100);
                student_main.NavigateTo();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        scan.close();
        return studentNames;
    }

    public static void RemoveStudent(String firstName, String lastName){
        System.out.println("Please select a student to delete (choose the number) :");
        for(int i = 0; i < studentNames.length; i++){
            System.out.println("["+i+"]\t" + studentNames[i]);
        }
        choice = scan.nextInt();

        switch (choice){
            case 0:case 1: case 2 : case 3: case 4: case 5:
            case 6:case 7: case 8 : case 9: case 10: case 11:
            case 12: case 13: case 14: case 15:
            System.out.println("Student removed with success.\n" +
                    "\nInfos : " + studentNames[choice]);
                studentNames[choice] = "null";
            try {
                sleep(100);
                student_main.NavigateTo();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void SearchStudent(String firstName, String lastName){
        System.out.println("Please input the name of the student to search :");
        String toSearch = scan.next();
        boolean ifContains = Arrays.asList(studentNames).contains(toSearch);
        for (int i = 0; i <= studentNames.length; i++){

        }
    }

    public void ReportUser(){
        System.out.println("Please put the student ID to report :");
        Scanner repSc = new Scanner(System.in);
        for(int i = 0; i < studentNames.length; i++){
            System.out.println("["+i+"]\t" + studentNames[i]);
        }
        int rep_ch = repSc.nextInt();
        System.out.println("User reported with ID n." + rep_ch + "\n"
        + "Student :" + studentNames[rep_ch]);
    }

    public void RemoveAll(){
        for(int i = 0; i <= studentNames.length - 1; i++){
            studentNames[i] = "null";
        }
        System.out.println("All students were successfully removed.");
        try {
            sleep(100);
            student_main.NavigateTo();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
