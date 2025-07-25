import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min;
        int max;
        int c = 0;
        int sum = 0;
        int n;
        System.out.println("Input numbers to be added to a list & have the average calculated");
        System.out.print("Add what number? (Input 0 to end): ");
        n = scanner.nextInt();
        c++;
        //sets up empty variables for highest and lowest number, sets another as the input
        //sets up others as the sum and counter
        max = n;
        min = n;
        sum = sum + n;
        //sets the first input as highest and lowest values, and adds it to the sum
        while (n != 0){
            System.out.print("Add what number? (Input 0 to end): ");
            n = scanner.nextInt();
            sum = sum + n;
            if(n !=0){
                c++;}
            if((n > max)&&(n!=0)){max = n;}
            if((min>n)&&(n!=0)){min=n;}}
            //until a 0 is input, the loop does these things:
            //read an input to be added
            //changes the highest value to it if it's higher
            //similar with the lowest, but also if it's not 0
            //adds 1 to the counter
            //adds it to the sum
        int av = sum/c;
        //calculates the average by dividing the sum by the number of inputs
        System.out.println("Results");
        System.out.println("Smallest Number: "+min);
        System.out.println("Largest Number: "+max);
        System.out.println("Average of all "+c+" numbers: "+av);
    scanner.close();
    }
}
