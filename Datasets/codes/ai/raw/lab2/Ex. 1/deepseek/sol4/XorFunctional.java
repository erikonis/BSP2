import java.util.function.BiFunction;

public class XorFunctional {
    public static void main(String[] args) {
        BiFunction<Boolean, Boolean, Boolean> xor = (a, b) -> (a || b) && !(a && b);

        boolean a = false, b = false;
        System.out.println(a + " XOR " + b + " = " + xor.apply(a, b));

        a = false; b = true;
        System.out.println(a + " XOR " + b + " = " + xor.apply(a, b));

        a = true; b = false;
        System.out.println(a + " XOR " + b + " = " + xor.apply(a, b));

        a = true; b = true;
        System.out.println(a + " XOR " + b + " = " + xor.apply(a, b));
    }
}