public package ex5;

public class Coins {
    public static void main(Stringargs) {
        int count = 0;
        for (int c20 = 0; c20 <= 5; c20++) {
            for (int c10 = 0; c10 <= 10 - 2 * c20; c10++) {
                for (int c5 = 0; c5 <= 20 - 2 * c20 - c10; c5++) {
                    if (20 * c20 + 10 * c10 + 5 * c5 == 100) {
                        System.out.println(c20 + " x 20c, " + c10 + " x 10c, " + c5 + " x 5c");
                        count++;
                    }
                }
            }
        }
        System.out.println("Total possibilities: " + count);
    }
} {

}