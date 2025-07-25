package lu.uni.programming1.lab3.exercise5;

public class Coins {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 20; k++) {
                    if (i*20 + j*10 + k*5 == 100) {
                        System.out.printf("%2s*20 + %2s*10 + %2s*5 = 100\n", i, j, k);
                        count++;
                    }
                }
            }
        }
        System.out.println("Possibilities: " + count);
    }

}
