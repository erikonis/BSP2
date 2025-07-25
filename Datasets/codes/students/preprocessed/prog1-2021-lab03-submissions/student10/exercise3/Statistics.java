import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your values: ");
        System.out.println("0 will stop the programm");
        int n=0;
        int sum=0;
        int i=0;
        double average=0;
        int max=-2147483648;
        int min=2147483647;

        do
        {   n= scanner.nextInt();
            if(n!=0){
                max=Math.max(max, n);
                min=Math.min(min, n);
                sum=sum+n;
                i++;
            }
        }
        while(n!=0);
        

        	if(i!=0)
        average=sum/i;

        System.out.println("The max is :"+max+" \nThe min is : "+min+"\nThe average is :"+average);
        scanner.close();
    }
}
