import java.util.function.*;

public class OneTo100 {
    public static void main(String[] args) {
        IntConsumer print = System.out::println;
        IntStream.rangeClosed(1, 100).forEach(print);
    }
}