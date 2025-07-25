import java.util.Scanner;

public class DivThreeCeptions {
 
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in); 
        long in = sc.nextLong(); 
        long org_in = in; 
        long sum = 0;

        sc.close();
        
        while(in >= 10){ 
            sum =0;
            while(in>0){ 
                sum+= in% 10;
                in/=10;
            }
            in = sum; 
        }
        switch((int)in % 3){
            case(0):{ // checking if the sum is divisible by 3
                        System.out.println(org_in+ " is divisible by 3");
                    }break;
            default:{
                        System.out.println(org_in+ " is not divisible by 3");
                    }break;

    
        }
    }
}

