public class OneToFive {
    public static void main(String[] args) {
        count(1);
    }
    
    private static void count(int n) {
        if (n <= 5) {
            System.out.println(n);
            count(n + 1);
        }
    }
}