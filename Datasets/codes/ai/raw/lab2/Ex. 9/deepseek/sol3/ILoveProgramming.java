public class ILoveProgramming {
    private static final int TOTAL_PRINTS = 20;
    private static final String MESSAGE = "I love programming!";

    public static void main(String[] args) {
        printProgrammingLove();
    }

    private static void printProgrammingLove() {
        int count = 0;
        while (count < TOTAL_PRINTS) {
            System.out.println(MESSAGE);
            count++;
        }
    }
}