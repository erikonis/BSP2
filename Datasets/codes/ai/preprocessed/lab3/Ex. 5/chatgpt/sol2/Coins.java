public class Coins {
    public static void main(String[] args) {
        int count = 0;

        for (int c20 = 0; c20 <= 5; c20++) {
            for (int c10 = 0; c10 <= 10; c10++) {
                for (int c5 = 0; c5 <= 20; c5++) {
                    if (c20 * 20 + c10 * 10 + c5 * 5 == 100) {
                        System.out.println(c20 + "x20c + " + c10 + "x10c + " + c5 + "x5c");
                        count++;
                    }
                }
            }
        }
        System.out.println("Total possibilities: " + count);
    }
}