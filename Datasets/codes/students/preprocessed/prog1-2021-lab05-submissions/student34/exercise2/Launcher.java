import java.util.Scanner;

@SuppressWarnings("all")
public class Launcher {

	public static void main(String[] args) {
        
        String[] arr; 
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lenght of the list: ");
        int lenght = scanner.nextInt();
        arr = new String[lenght];
        listLab attendance = new listLab(lenght, arr);

        int counter = 0;

        do {
            System.out.println("Enter the Name of the student (Name_Lastname): ");
            String name = scanner.next(); 
            attendance.addstudent(name, counter);
            counter++;
        } while (counter < lenght);

        System.out.println("Enter (1) if you want to search a student, (2) if you want to remove a student, (3) if you want to delete all the list and (4) if you want to see the list of all students ");
		
        int answer = scanner.nextInt();

		switch (answer) {
		case 1:
            System.out.println("Name to search: ");
            String nametosearch = scanner.next();
            int i = attendance.searchStudent(nametosearch);
            System.out.println("index: "+ i);
            attendance.report();
			break; 
		case 2:
            System.out.println("Name to remove: ");
            String nametoremove = scanner.next();
            attendance.removeName(nametoremove);
            attendance.report();
			break;
        case 3:
            attendance.removeall();
            break;
        case 4:
            attendance.report();
            break;
		default:
			System.out.println("invalid answer ...");
			break; 
		}


	}

}

