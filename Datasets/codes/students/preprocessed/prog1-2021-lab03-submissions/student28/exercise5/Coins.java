public class Coins {

 
     
    public static void main(String[] args) {
        // TODO code application logic here
        //set the sum to 1 euro or 100 cents
        int sum = 100;
        //define an arrray to store the coins
        int coins[] = {20, 10, 5};
        //pass the array and sum to the function 
        System.out.println("The number of combinations is " + findNumberOfCombinations(sum, coins));
        
    }
    public static int findNumberOfCombinations(int sum, int coins[]) {
        //boundary checks
        if (sum < 0) {
            return 0;
        }
        //check if the array is empty
        if (coins == null || coins.length == 0) {
            return 0;
        }
        //start calculating the combinations
        //create an array to hold the sum of our combinations
        int results[] = new int[sum + 1];
        //initialise the first value to 0 to prevent an exception 
        results[0] = 1;
        //start looping from each coin
        for (int i = 0; i < coins.length; ++i) {
            //inner loop runs for each coin value and stops when the sum is reached
            for (int j = coins[i]; j <= sum; ++j) {
                //keep adding the sum of the values to the difference of the coin until the sum is reached
                results[j] += results[j - coins[i]];
            }
        }
        return results[sum];
    }
    
}
