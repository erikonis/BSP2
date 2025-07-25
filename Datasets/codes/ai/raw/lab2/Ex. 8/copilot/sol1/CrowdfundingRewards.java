import java.util.Scanner;

public class CrowdfundingRewards {
    public static void showRewards() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount you want to pledge: ");
        int amount = scanner.nextInt();

        switch (amount) {
            case 10:
                System.out.println("Reward: Beer with TAs");
                break;
            case 20:
                System.out.println("Reward: Beer with TAs");
                System.out.println("Reward: Your name in ASCII art");
                break;
            case 50:
                System.out.println("Reward: Beer with TAs");
                System.out.println("Reward: Your name in ASCII art");
                System.out.println("Reward: Public display of your donation on Moodle");
                break;
            case 100:
                System.out.println("Reward: Beer with TAs");
                System.out.println("Reward: Your name in ASCII art");
                System.out.println("Reward: Public display of your donation on Moodle");
                System.out.println("Reward: Uni.lu USB Stick of 128GB");
                break;
            case 200:
                System.out.println("Reward: Beer with TAs");
                System.out.println("Reward: Your name in ASCII art");
                System.out.println("Reward: Public display of your donation on Moodle");
                System.out.println("Reward: Uni.lu USB Stick of 128GB");
                System.out.println("Reward: Uni.lu Smartphone cover");
                System.out.println("Reward: Keychain 'I love Programming 1'");
                break;
            case 500:
                System.out.println("Reward: Beer with TAs");
                System.out.println("Reward: Your name in ASCII art");
                System.out.println("Reward: Public display of your donation on Moodle");
                System.out.println("Reward: Uni.lu USB Stick of 128GB");
                System.out.println("Reward: Uni.lu Smartphone cover");
                System.out.println("Reward: Keychain 'I love Programming 1'");
                System.out.println("Reward: Autograph of your professors");
                System.out.println("Reward: Five free lunches at the 'Food house'");
                break;
            default:
                System.out.println("Invalid donation amount!");
        }
    }
}