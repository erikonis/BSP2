import java.util.Scanner;

public class CrowdfundingRewards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the donation amount
        System.out.print("Enter the amount you want to pledge: ");
        int amount = scanner.nextInt();

        // Display rewards based on the donation amount
        switch (amount) {
            case 500:
                System.out.println("Autograph of your professors");
                System.out.println("Five free lunches at the \"Food house\"");
            case 200:
                System.out.println("Uni.lu Smartphone cover");
                System.out.println("Keychain \"I love Programming 1\"");
            case 100:
                System.out.println("Uni.lu USB Stick of 128GB");
            case 50:
                System.out.println("Public display of your donation on Moodle");
            case 20:
                System.out.println("Your name in ASCII art");
            case 10:
                System.out.println("Beer with TAs");
                break;
            default:
                System.out.println("Error: " + amount + " e donations are not allowed!");
        }

        scanner.close();
    }
}
