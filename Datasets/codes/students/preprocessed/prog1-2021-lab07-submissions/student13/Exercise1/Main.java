import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        Controller c= new Controller();

        c.actionSequence("forward", "left", "left", "left", "right", "forward", "forward", "left", "right", "left");

        /*for(int i=1; i<=10; i++)
        {
            System.out.println("Action to perform: ");
            String action= scanner.next();
            System.out.println();
            c.action(action);
        }*/
        
        scanner.close();
    }
}
