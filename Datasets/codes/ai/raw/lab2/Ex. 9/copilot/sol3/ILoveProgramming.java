public class ILoveProgramming {
    public static void main(String[] args) {
        printMessage(20);
    }

    public static void printMessage(int times) {
        if (times > 0) {
            System.out.println("I love programming!");
            printMessage(times - 1);
        }
    }
}
