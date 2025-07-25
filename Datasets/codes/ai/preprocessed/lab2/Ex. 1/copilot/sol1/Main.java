public class Main {
    public static void main(String[] args) {
        boolean[] values = {false, true};
        for (boolean a : values) {
            for (boolean b : values) {
                System.out.println("a: " + a + ", b: " + b + " -> a ⊕ b: " + XorOperator.xor(a, b));
            }
        }

        // Using built-in XOR operator
        for (boolean a : values) {
            for (boolean b : values) {
                System.out.println("a: " + a + ", b: " + b + " -> a ^ b: " + (a ^ b));
            }
        }
    }
}