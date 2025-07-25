package lu.uni.programming1.lab3.exercise2;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int n,c=1;
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a positive number:");
        n=scanner.nextInt();
        while(n<0)
        {
            System.out.println("Please type a positive number:");
        n=scanner.nextInt();

        }
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum with Forloop : "+sum);
        sum=0;
        while(c<=n)
        {
            sum=sum+c;
            c++;
        }
        System.out.println("The sum with Whileloop : "+sum);
        sum=0;
        c=1;
        do
        {
            sum=sum+c;
            c++;
        }while(c<=n);
        System.out.println("The sum with DoWhileloop : "+sum);

        //The results are the same;
        scanner.close();


    }
}
