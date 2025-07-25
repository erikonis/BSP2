import java.util.*;

public class PrimeSieve {
    public static void main(String[] args) {
        boolean prime[] = new boolean[100];
        Arrays.fill(prime, Boolean.TRUE);

        for(int p = 2; p*p < 100; p++){
            if(prime[p] == true)
            {
                for(int i = p*p; i < 100; i += p){
                    prime[i] = false;
                }
            }
        }
        
        for(int i = 2; i < 100; i++){
            if(prime[i] == true){
                System.out.print(i + " ");
            }
        }
    }
}
