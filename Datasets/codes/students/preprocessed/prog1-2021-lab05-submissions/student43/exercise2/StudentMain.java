import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {

        String firstName;
        String lastName;
        int i = 0;

        Scanner scanner = new Scanner(System.in);
        

        // Ask how many student you want to have 

        System.out.println("How many student in your classroom ? Give an integer number ");
        int size = scanner.nextInt();
        
        StudentList s = new StudentList(size);
        
        // Add a student
        
        while(true){
            System.out.println(" What is the first name and last name ? \n (firstname and lastname separated by space) ");
            firstName = scanner.next();
            lastName = scanner.next();
            s.addStudent(firstName, lastName);
            ++i;
            if ( i == size) {
                break ;
            }
            
        } 

        // Report all the student

    
        s.reportallStudents();

        // Look for a student

        System.out.println("For which student do you want to look for \n (firstname and lastname separated by space)");
        String first = scanner.next();
        String last = scanner.next();

        s.lookForStudent(first, last);
        

        // Remove one or all the students
        System.out.println("Do you want to remove a student ? (Yes =1/ No=0) ");
        int answerbis = scanner.nextInt();

        if (answerbis == 1) {
            System.out.println("What is the firstname and lastname? :");
            firstName = scanner.next();
            lastName = scanner.next();
            s.rmOneStudent(firstName, lastName);
        }

        s.reportallStudents();

        System.out.println("Do you want to remove all the students ? (Yes =1/ No=0) ");
        int answer = scanner.nextInt();

        if (answer == 1) {
            s.getrmAllStudents();
            s.reportallStudents();
            System.out.println("\n The list is empty.");
        }
        if (answer == 0){
            s.reportallStudents();
        }
        
        scanner.close();

    }
}
