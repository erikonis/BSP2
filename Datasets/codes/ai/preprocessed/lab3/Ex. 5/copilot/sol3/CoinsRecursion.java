public package exercise3;

public class CoinsRecursion {
    public static void main(String[] args) {
        int totalWays = decompose(100, 20);
        System.out.println("Total number of ways: " + totalWays);
    }

    public static int decompose(int amount, int coin) {
        if (amount == 0) {
            return 1;
        }
        if (amount < 0 || coin == 0) {
            return 0;
        }
        int nextCoin = (coin == 20) ? 10 : (coin == 10) ? 5 : 0;
        return decompose(amount - coin, coin) + decompose(amount, nextCoin);
    }
} {

}