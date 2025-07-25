package lu.uni.programming1.lab5.exercise2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Thread.*;

public class Students {

    private static int choice;
    private String firstName,lastName;
    private static String[] studentNames;
    private static Colors cols = new Colors();
    private static Scanner sc = new Scanner(System.in);
    private static Student_main student_main = new Student_main();
    private static int i = -1;

    public Students(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static String[] InitArray(){ //fired once
        System.out.println("Please input a number for the array length :");
        int c = sc.nextInt();
        studentNames = new String[c];
        student_main.NavigateTo();

        return studentNames;
    }

    public static void DisplayStudents(){
        System.out.println(cols.ANSI_CYAN + "List of students :" + cols.ANSI_RESET);
        for(int i = 0; i < studentNames.length; i++){
            System.out.println("["+i+"]\t" + studentNames[i]);
        }
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        student_main.NavigateTo();
    }

    public String[] AddStudent(){
        System.out.println("Please enter the firstname of the student : ");
        firstName = sc.next();
        System.out.println("Please enter the lastname of the student :");
        lastName = sc.next();
        i++;
        try{
            studentNames[i] = firstName + " " + lastName;
        }
        catch (Exception e){
            System.out.println("Student exception : " + e);
        }
        finally {
            System.out.println("["+cols.ANSI_GREEN+"+"+cols.ANSI_RESET+"] Student added with success.\n" +
                    "Students ID : " + i +
                    "\nFirstname : " + cols.ANSI_CYAN + firstName + cols.ANSI_RESET +
                    "\nLastname : " + cols.ANSI_CYAN + lastName + cols.ANSI_RESET);
            try {
                sleep(5000);
                student_main.NavigateTo();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        sc.close();
        return studentNames;
    }

    public static void RemoveStudent(){
        System.out.println("Please select a student to delete (choose the number) :");
        for(int i = 0; i < studentNames.length; i++){
            System.out.println("["+i+"]\t" + studentNames[i]);
        }
        choice = sc.nextInt();

        System.out.println("["+cols.ANSI_RED+"-"+cols.ANSI_RESET+"] Student removed with success.\n" +
                "\nInfos : " + cols.ANSI_CYAN + studentNames[choice] + cols.ANSI_RESET);
            studentNames[choice] = null;
        try {
            sleep(5000);
            student_main.NavigateTo();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void SearchStudent(){
        System.out.println("Please input the name of the student to search :");
        String toSearch = sc.next();
        List list = Arrays.asList(studentNames);
        for (int i = 0; i <= studentNames.length; i++){
            list.contains(toSearch);
        }
    }

    public void ReportUser(){
        System.out.println("Please put the student ID to report :");
        Scanner repSc = new Scanner(System.in);
        for(int i = 0; i < studentNames.length; i++){
            System.out.println("["+i+"]\t" + studentNames[i]);
        }
        int rep_ch = repSc.nextInt();
        System.out.println("User reported with ID n." + cols.ANSI_BLUE + rep_ch + cols.ANSI_RESET + "\n"
        + "Student :" + cols.ANSI_BLUE + studentNames[rep_ch] + cols.ANSI_RESET);
    }

    public void RemoveAll(){
        for(int i = 0; i <= studentNames.length - 1; i++){
            studentNames[i] = "null";
        }
        System.out.println(cols.ANSI_RED + "All students were successfully removed." + cols.ANSI_RESET);
        try {
            sleep(5000);
            student_main.NavigateTo();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
