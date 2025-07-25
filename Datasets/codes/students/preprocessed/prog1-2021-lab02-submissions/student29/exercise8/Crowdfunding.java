import java.util.Scanner;

public class Crowdfunding {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pledge;
        String rewards = "";

        System.out.print("Please enter how much you want to pledge to get the appropriate rewards. 10$, 20$, 50$, 100$, 200$ or 500$ ? \nYour choice: ");
        pledge = scanner.nextInt();

        switch (pledge)

        {
            case 500:
                rewards += "Autograph of your professors \nFive free lunches at the food house";

            case 200:
                rewards += "\nUni.lu smartphone cover \nKeychain I love Programming 1";

            case 100:
                rewards += "\nUni.lu USB stick of 128 GB.";

            case 50:
                rewards += "\nPublic display of your donation on Moodle.";

            case 20:
                rewards += "\nYour name in ASCII art.";

            case 10:
                rewards += "\nBeer with TAs.";
                break;

            default:
                System.out.println("Please choose a proper amount to get supporter rewards.");
        }

        System.out.println(rewards);

        scanner.close();
    }
}