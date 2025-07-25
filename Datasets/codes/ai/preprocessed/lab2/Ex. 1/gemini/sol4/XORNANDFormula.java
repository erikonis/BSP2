public class XORNANDFormula {
    // Function to simulate NAND operation
    public static boolean nand(boolean a, boolean b) {
        return !(a && b);
    }

    public static void main(String[] args) {
        boolean a;
        boolean b;
        boolean xorResult;

        System.out.println("a\tb\ta ^ b (NAND Formula)");
        System.out.println("--------------------------");

        // Case 1: a = false, b = false
        a = false;
        b = false;
        xorResult = nand(nand(nand(a, a), b), nand(a, nand(b, b)));
        System.out.println(a + "\t" + b + "\t" + xorResult);

        // Case 2: a = false, b = true
        a = false;
        b = true;
        xorResult = nand(nand(nand(a, a), b), nand(a, nand(b, b)));
        System.out.println(a + "\t" + b + "\t" + xorResult);

        // Case 3: a = true, b = false
        a = true;
        b = false;
        xorResult = nand(nand(nand(a, a), b), nand(a, nand(b, b)));
        System.out.println(a + "\t" + b + "\t" + xorResult);

        // Case 4: a = true, b = true
        a = true;
        b = true;
        xorResult = nand(nand(nand(a, a), b), nand(a, nand(b, b)));
        System.out.println(a + "\t" + b + "\t" + xorResult);
    }
}