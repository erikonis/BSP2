package lu.uni.programming1.lab3.exercise1;

public class OneToFive {

    public static void main(String[] args) {
        int b = 5;

        for (int i = 0; i < b; i++) {
            System.out.print(i);
            if (i != b) {
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
        }
    }
}
