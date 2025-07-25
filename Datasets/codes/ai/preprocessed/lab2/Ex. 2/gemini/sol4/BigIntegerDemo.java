import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger veryLargeNumber1 = new BigInteger("99999999999999999999999999999999999999999999999999");
        BigInteger veryLargeNumber2 = new BigInteger("1");
        BigInteger sum = veryLargeNumber1.add(veryLargeNumber2);
        System.out.println("Sum of very large numbers: " + sum);
    }
}