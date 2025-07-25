package lu.uni.programming1.lab3.exercise5;

public class Coins {
    public static void main(String[] args) {
        int s = 0;
        int n = 0;

        for (int i = 0; i <= 5; i++)
            for (int j = 0; j <= 10; j++)
                for (int k = 0; k <= 20; k++) {
                    s = i * 20 + j * 10 + k * 5;
                    if (s == 100) {
                        n++;
                        System.out.println("Possibility " + n + ":\n -" + i + " coins of 20 cents \n -" + j
                                + " coins of 10 cents \n -" + k + " coins of 5 cents. \n");
                    }
                }

    }
}
