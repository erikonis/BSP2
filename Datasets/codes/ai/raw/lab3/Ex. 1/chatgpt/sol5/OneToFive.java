import java.util.stream.IntStream;

public class OneToFive {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 5).forEach(System.out::println);
    }
}
