import java.util.Scanner;

public class XtoY {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double startNumber = scanner.nextDouble();
        double endNumber = scanner.nextDouble();
        double steps = scanner.nextDouble();

        /*if(endNumber<startNumber){
            startNumber = startNumber + endNumber;
            endNumber = startNumber - endNumber;
            startNumber = startNumber - endNumber;
        }*/
        
        for(double i = startNumber; i<endNumber; i = i + steps){
            System.out.format("%.1f", i );
            System.out.print(", ");
        }

        scanner.close();

        System.out.format("%.1f", endNumber);

    }
}
