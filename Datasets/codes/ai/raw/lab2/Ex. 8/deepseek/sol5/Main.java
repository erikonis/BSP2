import model.*;
import service.*;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RewardService rewardService = new RewardService();
        
        System.out.println("Available pledge amounts: 10, 20, 50, 100, 200, 500 euros");
        System.out.print("Enter your pledge amount: ");
        int amount = scanner.nextInt();
        
        if (!InputValidator.isValidPledgeAmount(amount)) {
            System.out.println("Error: " + amount + " euro donations are not allowed!");
            System.out.println("Please choose one of the available amounts.");
            return;
        }
        
        Pledge pledge = new Pledge(amount);
        List<Reward> rewards = rewardService.getRewardsForPledge(pledge);
        
        System.out.println("\nFor your pledge of " + amount + " euros, you receive:");
        rewards.forEach(System.out::println);
    }
}