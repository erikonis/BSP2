public class OneToFive {
    public static void main(String[] args) {
        java.util.stream.IntStream.rangeClosed(1, 5).forEach(System.out::println);
    }
}