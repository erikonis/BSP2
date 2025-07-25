
// Exercise 5: Coins.java
public class Coins {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 10; j++) {
                for (int k = 0; k <= 20; k++) {
                    if (i * 20 + j * 10 + k * 5 == 100) {
                        System.out.println(i + "x20c " + j + "x10c " + k + "x5c");
                        count++;
                    }
                }
            }
        }
        System.out.println("Total: " + count);
    }
}
