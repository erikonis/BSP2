import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the size of the list, you want to enter? ");
        List list = new List(scanner.nextInt());
        
        byte method = 1;
        String student = "";

        while (method != 0) {
            //asks user what they want to do
            System.out.print("Press 1 to add a student, 2 to remove a student, 3 to search for a student, 4 to report the students, 5 to remove all students or 0 to end: ");
            method = scanner.nextByte();
            
            switch (method) {
                case 1:
                    System.out.print("Which student do you want to add?\nPlease enter the first name and the last name seperated by a space: ");
                    String name = (scanner.next() + " " +  scanner.next());
                    student = name;
                    list.add(student);
                    break;

                case 2:
                    System.out.print("Which student do you want to remove? ");
                    student = scanner.next() + " " + scanner.next();
                    list.remove(student);
                    break;

                case 3:
                    System.out.print("Which student do you want to search? ");
                    student = scanner.next() + " " + scanner.next();
                    System.out.println(student + "'s index is " + list.search(student) + ".");
                    break;

                case 4:
                    list.report();
                    break;
                
                case 5:
                    list.removeAll();
                    break;

                //doesn't go to default
                case 0:
                    break;

                default:
                    System.out.println("Please enter a valid number");
                    break;
            }
        }

        scanner.close();
    }
}
