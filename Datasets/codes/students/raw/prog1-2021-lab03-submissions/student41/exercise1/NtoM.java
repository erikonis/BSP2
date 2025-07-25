import java.util.Scanner;

public class NtoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a starting number N: ");
        int N = scanner.nextInt();
        System.out.print("Input an ending number M: ");
        int M = scanner.nextInt();
        //asks for the starting and ending numbers of a sequence
        if (N<M){
            System.out.println("Start: "+N);
            System.out.println("End: "+M);
            N--;
            //removes 1 from the starting number to print it later
            while(N<M){
                System.out.print(++N+ " ");
                //loops adding 1 to N and printing it as long as N<M
            }
        }
        else{
        System.out.println("Invalid input, try again");}
        //accounts for someone inputing a starting number higher than ending number
        scanner.close();
}
    
}
