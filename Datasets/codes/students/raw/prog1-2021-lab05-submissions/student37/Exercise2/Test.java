package Exercise2;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        int x =15; 
        String firstnametemp = new String();
        String lastnametemp = new String();
        String[] testFirstNames = new String[x];
        String[] testLastNames = new String[x];
        boolean [] testSeats = new boolean[x];
        StudentArray testArray = new StudentArray(testFirstNames, testLastNames, testSeats);

        Scanner sc = new Scanner(System.in); 

        testArray.reset();


        System.out.println("Student List Manager: ");
        char programstate ='i';
        char add ='A';
        char reportchar = 'E';
        char findstudent = 'F';
        char removestudent = 'r';
        char removeall = 'R'; 
        char exit = 'X';

        while (programstate!=exit) {
            System.out.println("To add a new student to the list type A, to display the current enrolled students type E, ");
            System.out.println("To find a student's index type F, to remove a student type r, ");
            System.out.println("To remove all students type R, to exit type X."); 
                
                programstate = sc.nextLine().charAt(0);
    
                if (programstate==add) { 
                    
                    System.out.println("Type student firstname: " ); 
                    firstnametemp = sc.nextLine();
    
                    System.out.println("Type student lastname: " ); 
                    lastnametemp = sc.nextLine();
    
                    testArray.addStudent(firstnametemp, lastnametemp);
                    
                };
    
                if (programstate==reportchar) {   testArray.report();
    
    
                }; 
    
                if (programstate==findstudent) {    System.out.println("Find student: ");
    
    
                System.out.println("Type student firstname: " ); 
                    firstnametemp = sc.nextLine();

                    System.out.println("Type student lastname: " ); 

                    lastnametemp = sc.nextLine();
    
    
                    testArray.find(firstnametemp, lastnametemp);
    
    
                };
    
                if (programstate==removestudent) {
    
                    System.out.println("Type student firstname: " ); 
                    firstnametemp = sc.nextLine();
    
                    System.out.println("Type student lastname: " ); 
                    lastnametemp = sc.nextLine();
    
                    testArray.removeStudent(firstnametemp, lastnametemp);
    
                };
    

                if (programstate==removeall) { testArray.reset(); System.out.println("Removed all students... ");}; 
    
                if (programstate==exit) {System.out.println("Exiting... "); sc.close(); System.exit(0);};
                };


        sc.close();
    }
}
