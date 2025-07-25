import java.util.Scanner;

public class CrowdfundingEnumApp {

    public enum Tier {
        TEN(10), TWENTY(20), FIFTY(50), HUNDRED(100), TWO_HUNDRED(200), FIVE_HUNDRED(500);

        private final int amount;

        Tier(int amount) {
            this.amount = amount;
        }

        public int getAmount() {
            return amount;
        }

        public static Tier fromAmount(int amount) {
            for (Tier tier : values()) {
                if (tier.amount == amount) return tier;
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your donation amount (10, 20, 50, 100, 200, 500): ");
        int donation = scanner.nextInt();

        Tier tier = Tier.fromAmount(donation);

        if (tier == null) {
            System.out.println("❌ Invalid donation amount. Please choose from 10, 20, 50, 100, 200, or 500 euros.");
        } else {
            System.out.println("\nYour rewards:");
            switch (tier) {
                case FIVE_HUNDRED:
                    System.out.println("- Autograph of your professors");
                    System.out.println("- Five free lunches at the \"Food house\"");
                case TWO_HUNDRED:
                    System.out.println("- Uni.lu Smartphone cover");
                    System.out.println("- Keychain \"I love Programming 1\"");
                case HUNDRED:
                    System.out.println("- Uni.lu USB Stick of 128GB");
                case FIFTY:
                    System.out.println("- Public display of your donation on Moodle");
                case TWENTY:
                    System.out.println("- Your name in ASCII art");
                case TEN:
                    System.out.println("- Beer with TAs");
                    break;
            }
        }

        scanner.close();
    }
}