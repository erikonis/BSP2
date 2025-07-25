public class Coins {
    
    public static void main(String[] args) { 

        int euro = 100;
        int[] coins = {20, 10, 5};
        System.out.println(coinChange(0, euro, coins, ""));   
    }

    public static int coinChange(int ci, int remaining, int[] coins, String paid) {
        
        if (remaining == 0) {
            // Can be paid using only given coins
            System.out.println(paid);
            // Ads 1 to the total amount of possibilities
            return 1;
        }
        if (remaining < 0) {
            // If remaining < 0 it is not a way to decompose 1€
            return 0;
        }
 
        int res = 0;
        for (int i = ci; i < coins.length; i++) {
 
            /*
             * Start our loop from current index, as 
             * if we loop through all currencies once again 
             * then there will be a repetition in the ways used 
             * to decompose 1€.
             */
            res += coinChange(i, remaining - coins[i], coins, paid + Integer.toString(coins[i]) + ", ");
        }
        return res;
    }
}
