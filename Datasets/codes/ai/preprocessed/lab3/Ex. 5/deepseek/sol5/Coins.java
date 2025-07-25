public class Coins {
    public static void main(String[] args) {
        int count = 0;

        System.out.println("All possible combinations:");
        System.out.println("20c\t10c\t5c");
        System.out.println("-------------------");

        for (int twenty = 0; twenty <= 5; twenty++) {
            for (int ten = 0; ten <= 10; ten++) {
                for (int five = 0; five <= 20; five++) {
                    if (twenty * 20 + ten * 10 + five * 5 == 100) {
                        System.out.println(twenty + "\t" + ten + "\t" + five);
                        count++;
                    }
                }
            }
        }

        System.out.println("-------------------");
        System.out.println("Total combinations: " + count);
    }
}