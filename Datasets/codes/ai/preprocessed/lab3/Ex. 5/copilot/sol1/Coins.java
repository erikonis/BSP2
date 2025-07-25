public class Coins {
    public static void main(String[] args) {
        int totalWays = 0;
        for (int twenty = 0; twenty <= 5; twenty++) {
            for (int ten = 0; ten <= 10; ten++) {
                for (int five = 0; five <= 20; five++) {
                    if (twenty * 20 + ten * 10 + five * 5 == 100) {
                        System.out.println("20c: " + twenty + ", 10c: " + ten + ", 5c: " + five);
                        totalWays++;
                    }
                }
            }
        }
        System.out.println("Total number of ways: " + totalWays);
    }
}