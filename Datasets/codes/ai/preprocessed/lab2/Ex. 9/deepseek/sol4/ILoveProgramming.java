public class ILoveProgramming {
    private static final int PRINT_COUNT = 20;
    private static final String MESSAGE = "I love programming!";

    public static void main(String[] args) {
        printMessageMultipleTimes();
    }

    private static void printMessageMultipleTimes() {
        for (int i = 0; i < PRINT_COUNT; i++) {
            System.out.println(MESSAGE);
        }
    }
}