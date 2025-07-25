public class XorTest {
    public static void main(String[] args) {
        boolean a, b;

        // Test case 1: a = false, b = false
        a = false;
        b = false;
        System.out.println("a = " + a + ", b = " + b + " -> a ⊕ b = " + ((a && !b) || (!a && b)));

        // Test case 2: a = false, b = true
        a = false;
        b = true;
        System.out.println("a = " + a + ", b = " + b + " -> a ⊕ b = " + ((a && !b) || (!a && b)));

        // Test case 3: a = true, b = false
        a = true;
        b = false;
        System.out.println("a = " + a + ", b = " + b + " -> a ⊕ b = " + ((a && !b) || (!a && b)));

        // Test case 4: a = true, b = true
        a = true;
        b = true;
        System.out.println("a = " + a + ", b = " + b + " -> a ⊕ b = " + ((a && !b) || (!a && b)));
    }
}