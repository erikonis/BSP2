import java.util.Scanner;

public class Statistics {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        int count=0;
        int sum=0;

        System.out.print("Enter number: ");
        int n= scanner.nextInt();
        
        sum+=n;
        count++;

        int max=n;
        int min=n;

        while(n!=0)
        {
            System.out.print("Enter number: ");
            n=scanner.nextInt();

            if(n==0)
            {
                break;
            }
            if(n>max)
            {
                max=n;
            }
            if(n<min)
            {
                min=n;
            }
            
            sum+=n;
            count++;
        }

        double average = (double)sum/count;

        //print smallest, largest, and average of all numbers
        System.out.println("smallest number: " + min);
        System.out.println("largest number: " + max);
        System.out.println("average of all numbers: " + average);

        scanner.close();
    }
}
