import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert a number n: ");
        int N = 0;
        N = scanner.nextInt();
        //asks for a number to have the sum of all numbers from 0 to N be output
        //will be calculated in 3 ways
        while(N <= 0 ){
            System.out.println("Invalid input, try again.");
            System.out.print("Insert a number n: ");
            N = scanner.nextInt();
            //in case N <= 0, returns an error and asks again for an input
        };
        System.out.println("N: "+N);
        scanner.close();
        //prints accepted N value
        int S = 0;
        int C = 0;
        //creates empty sum and counter values
        for(;C <= N; C++){
            S = S + C;
            //loops adding 1 to C and adding it to S
        }
        System.out.println("For Loop: "+S);
        //prints the result
        S = 0;
        C = 0;
        //resets the values
        while(C<N){
            S = S + ++C;}
            //adds 1 to C and updated C to S with a while loop
        System.out.println("While Loop: "+S);
        S = 0;
        C = 0;
        //resets the values again
        do{
            S = S + ++C;
        }
        while(C < N);
        //same as the while loop, but it checks the relation of C and N afterwards
        System.out.println("Do-While Loop: "+S);
        S = 0;
        C = 0;
        //resets the values & uses the formula.
        S = (N*(N+1))/2;
        System.out.println("Formula: "+S);
    }
}
