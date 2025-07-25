import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(Decimal values are valid inputs)");
        System.out.print("Input a starting number X: ");
        float X = scanner.nextFloat();
        System.out.print("Input an ending number Y: ");
        float Y = scanner.nextFloat();
        System.out.print("Input the size of the step D: ");
        float D = scanner.nextFloat();
        //asks for float values to start and end with, plus the size of the steps taken between the two
        if (X<Y){
            System.out.println("Start: "+X);
            System.out.println("End: "+Y);
            System.out.println("Step Size: "+D);
            X = X-D;
            //removes a step from the start
            while(X<Y){
                X = X+D;
                System.out.print(X+ " ");
                //adds a step then prints as long as it's below the end value
            }
        }
        else{
        System.out.println("Invalid input, try again");}
        scanner.close();
    }
    
}
