package exercise2;

public class StudentDatabase1 {
    import java.util.Scanner;

public class StudentDatabase {

public static void main (String[] args) {
	// student object to store student records
	Student s = new Student();
	Scanner in = new Scanner(System.in);
	String input; // user's input
	System.out.println("Enter Students or exit");
	
	// add or remove student records until user enters exit
	while (!(input = in.nextLine()).equalsIgnoreCase("exit")) {
		String[] output = input.split(",");
		if (output[0].equalsIgnoreCase("add")) {
			s.storeStudents(output[1], output[2]);
			} else if (output[0].equalsIgnoreCase("remove")) {
				s.removeStudent(output[1]);
				} 
					}
					s.printStudents();
					}
					}
}
