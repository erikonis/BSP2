public class Launcher {
    public static void main(String[] args) {
        try {
            new PartyManager(2).run();
        } catch (Exception e) {
            System.err.println("Fatal error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}