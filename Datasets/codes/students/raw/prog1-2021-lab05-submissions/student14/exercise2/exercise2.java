import java.util.Scanner;

public class exercise2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter");

        sList r[] = new sList [15];
        
        int i = scanner.nextInt();
        --i;

        if (i>14){i = 14;}

        while (i>=0)
        {
        r[i].setSurname(scanner.next());
        r[i].setLastname(scanner.next());
        --i;
        }
        System.out.println("What student do you want to see?");
        int j = scanner.nextInt();
        System.out.println("Surname = " + r[j].getSurname() + "\rLastname = " + r[j].getLastname());
        scanner.close();
    }
}
