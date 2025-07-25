import java.util.Scanner;

public class Launcher {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter the size of the student list: ");
    int size = scanner.nextInt();

    StudentList studentlist = new StudentList(size);

    for(int i = 0; i < size; ++i){
        System.out.print("Do you want to add a new student? (true/false): ");
        Boolean answer = scanner.nextBoolean();
        if(answer ==true){
            System.out.print("Please enter the student names: firstname lastname (separate them with a space) : ");
            String firstName = scanner.next();
            String lastName = scanner.next();
            studentlist.add(firstName, lastName);
        }else{
            break;
        }
    } 

    System.out.println("Do you want to remove a student from the list? (true/false): ");
    Boolean answer = scanner.nextBoolean();
    if(answer == true){
        System.out.println("Please enter a student names to remove: firstname lastname (separate them with a space) : ");
        String firstName = scanner.next();
        String lastName = scanner.next();
        studentlist.remove(firstName, lastName);
    }

    System.out.println("Do you want to search a student from the list? (true/false): ");
    answer = scanner.nextBoolean();
    if(answer == true){
        System.out.println("Please enter a student names to find: firstname lastname (separate them with a space) : ");
        String firstName = scanner.next();
        String lastName = scanner.next();
        studentlist.search(firstName, lastName);
    }

    System.out.println("Do you want to report the list? (true/false): ");
    answer = scanner.nextBoolean();
    if(answer == true){
        studentlist.report();
    }

    System.out.println("Do you want to remove all students? (true/false): ");
    answer = scanner.nextBoolean();
    if(answer == true){
        studentlist.removeall();
    }

    scanner.close();
}
    
}
