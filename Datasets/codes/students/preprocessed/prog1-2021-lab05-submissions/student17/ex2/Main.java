import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //define a boolean => for the loop
        boolean quit = false;
        //ask the user to enter a size
        System.out.println("Size please:");
        int size = sc.nextInt();
        Students students = new Students(size);
        //as long as quit is not true
        while(!quit){
            //show the user his options
            System.out.println("Available commands: add [First name] [Last name], remove [First name] [Last name], search [First name] [Last name], report, removeAll and quit:");
            String input = sc.nextLine();
            //To avoid the first empty line that the scanner always read at the beginning of the while
            if(input.equals("")){
                input = sc.nextLine();
            }
            //split string with .split
            String[] command = input.split(" ");
            //classical switch
            switch (command[0]) {
                //if the case is add
                case "add":
                    students.add(new Student(command[1], command[2]));
                    break;
                //if the case is remove
                case "remove":
                    students.remove(new Student(command[1], command[2]));
                    break;
                //if the case is search
                case "search":
                    System.out.println("Position in the list: " + students.search(new Student(command[1], command[2])));
                    break;
                //if the case is report
                case "report":
                    students.report();
                    break;
                //if the case is removeAll
                case "removeAll":
                    students.removeAll();
                    break;
                //if the case is quit
                case "quit":
                    quit = true;
                    break;
                //you always need a default value in switch
                //undefined commands
                default:
                    System.out.println("No such command available!");
                    System.out.println(input);
                    break;
            }
        }

        sc.close();
    }
}
