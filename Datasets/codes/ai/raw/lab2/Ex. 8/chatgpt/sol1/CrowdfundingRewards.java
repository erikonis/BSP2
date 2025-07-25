import java.util.Scanner;

public class CrowdfundingRewards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter donation amount: ");
        int amount = scanner.nextInt();
        scanner.close();

        switch (amount) {
            case 500: System.out.println("Autograph of your professors");
            case 200: System.out.println("Uni.lu Smartphone cover\nKeychain \"I love Programming 1\"");
            case 100: System.out.println("Uni.lu USB Stick of 128GB");
            case 50:  System.out.println("Public display of your donation on Moodle");
            case 20:  System.out.println("Your name in ASCII art");
            case 10:  System.out.println("Beer with TAs"); break;
            default:  System.out.println("Invalid donation amount!");
        }
    }
}
