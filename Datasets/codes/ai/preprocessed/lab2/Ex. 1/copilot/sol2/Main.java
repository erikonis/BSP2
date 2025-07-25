public class Main {
    public static void main(String[] args) {
        boolean[] values = {false, true};
        for (boolean a : values) {
            for (boolean b : values) {
                boolean result = (a || b) && !(a && b);
                System.out.println("a: " + a + ", b: " + b + " -> a ⊕ b: " + result);
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