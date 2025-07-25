public class ILoveProgrammingCustomMethod {
    public static void main(String[] args) {
        printMessageMultipleTimes("I love programming!", 20);
    }

    public static void printMessageMultipleTimes(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}