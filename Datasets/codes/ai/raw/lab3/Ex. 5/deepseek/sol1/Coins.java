package lab03.Ex. 5.deepseek.sol1;

public package exercise5;

public class Coins {
    public static void main(String[] args) {
        int count = 0;
        for (int twenty = 0; twenty <= 5; twenty++) {
            for (int ten = 0; ten <= 10; ten++) {
                for (int five = 0; five <= 20; five++) {
                    if (twenty * 20 + ten * 10 + five * 5 == 100) {
                        System.out.println("20c: " + twenty + ", 10c: " + ten + ", 5c: " + five);
                        count++;
                    }
                }
            }
        }
        System.out.println("Total possibilities: " + count);
    }
} {
    
}
