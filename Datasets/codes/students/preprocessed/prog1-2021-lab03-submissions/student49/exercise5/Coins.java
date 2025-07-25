import java.util.ArrayList;
// not finished still in progress
public class Coins {

    private static ArrayList<ArrayList<Integer>> Combinations = new ArrayList();
    
    public static void main(String[] args) {
        int[] coins = {5,10,20};

        combinations(coins, Combinations);

    }

    public static void combinations(int[] pCoins, ArrayList<ArrayList<Integer>> pOutArr)
    {
        for(int length = 5; length < 21; length++)
        {
            for(int i = 0; i<length;i++)
            {
                
            }
        }
    }

    public static void printCombinations()
    {
        for(int i = 0; i< Combinations.size();i++)
        {
            for(int j = 0; j<Combinations.get(i).size() ; j++)
            {
                System.out.println(Combinations.get(i).get(j));
            }
        }
    }
}
