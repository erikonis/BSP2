import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number n to find its counterpart in the Kellacci sequence.");
        System.out.print("Input:");
        int n = scanner.nextInt();
        int c = 2;
        int currentK = 2;
        int KMOne = 1;
        int KMTwo = 1;
        int temp = 0;
        //sets up values for the counter, previous two values of the sequence
        //asks for an input for its counterpart in the sequence
        if (n == 1){n = 1;
            System.out.println("K(1): 1");}
        if (n == 2){n = 1;
            System.out.println("K(1): 1");
            System.out.println("K(2): 1");}
            //accounts for 1 and 2 being input, which are both 1
        if (n>2){
            System.out.println("K(1): 1");
            System.out.println("K(2): 1");
            while(c<n){
                c++;
                currentK = ((KMOne -1) + (KMTwo*2));
                temp = currentK;
                KMTwo = KMOne;
                KMOne = temp;
                System.out.println("K("+c+"): "+currentK);
                //as long as the counter is smaller than the number:
                //adds 1 to counter
                //uses the formula of the current one with the two previous ones
                //creates a placeholder variable to set the values of the previous two results accordingly
            }
        }
    scanner.close();
    }
}
