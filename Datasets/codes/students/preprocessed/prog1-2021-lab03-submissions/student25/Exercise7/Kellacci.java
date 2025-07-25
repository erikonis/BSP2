import java.util.Scanner;

public class  Kellacci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        int prev1 =1 , prev2 = 1, tmp;

        for(int i = 1; i<= in; i++){
           if(i<=2){
               System.out.println(1); 
           }
           else{
               tmp = (prev1 -1)  + (prev2*2);
               System.out.println(tmp); 
               prev2 = prev1;
               prev1 = tmp;

               sc.close();
           }
        }
    }
}