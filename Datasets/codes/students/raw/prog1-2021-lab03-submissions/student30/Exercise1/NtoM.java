import java.util.Scanner;

public class NtoM {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = scanner.nextInt();
        int endNumber = scanner.nextInt();

        /*if(endNumber<startNumber){
            startNumber = startNumber + endNumber;
            endNumber = startNumber - endNumber;
            startNumber = startNumber - endNumber;
        }*/
        
        for(int i = startNumber; i<endNumber; i++){
            System.out.print(i + ", ");
        }

        scanner.close();

        System.out.print(endNumber);

    }
}
