public class XORUsingBitwise {
    public static void main(String[] args) {
        boolean[] values = {false, true};

        // Test all combinations of a and b
        for (boolean a : values) {
            for (boolean b : values) {
                System.out.println("a = " + a + ", b = " + b);
                // Using the built-in XOR operator
                boolean xorResult = a ^ b; // Java's bitwise XOR operator for boolean values
                System.out.println("a ⊕ b (using bitwise operator): " + xorResult);
                System.out.println();
            }
        }
    }
}