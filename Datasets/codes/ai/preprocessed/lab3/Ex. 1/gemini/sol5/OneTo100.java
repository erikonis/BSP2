public class OneTo100 {
    public static void main(String[] args) {
        java.util.stream.IntStream.rangeClosed(1, 100).forEach(System.out::println);
    }
}