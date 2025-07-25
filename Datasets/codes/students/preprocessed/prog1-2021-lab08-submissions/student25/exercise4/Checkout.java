import java.util.Scanner;
import java.util.UUID;

public class Checkout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you have a loyalty card? (yes or no)");
        String hasACard = scanner.next();

        SupermarketCardInfo cardInfo = new SupermarketCardInfo();

        if (hasACard.equals("no")) {
            System.out.println("Do you want a loyalty card? (yes or no)");
            String wantsACard = scanner.next();

            if (wantsACard.equals("yes")) {
                System.out.println("How many loyalty cards do you need?");
                int numberOfCards = scanner.nextInt();

                UUID randomId = UUID.randomUUID();

                for (int i = 0; i < numberOfCards; i++) {
                    LoyaltyCard loyaltyCard = new LoyaltyCard(randomId, 0, false);
                    cardInfo.add(loyaltyCard);
                }

            } else {
                System.out.println("Fine, have a nice day and visit us again.");
            }
        }

        System.out.println("Do you want a normal purchase or with your loyalty card? (normal or card)");
        String purchaseMethode = scanner.next();

        if (purchaseMethode.equals("normal")) {
            System.out.println("Please give the total cost of your purchase.");
            int cost = scanner.nextInt();

            System.out.println("Please give your card ID.");
            String givenID = scanner.next();

            int position = cardInfo.search(UUID.fromString(givenID));

            cardInfo.get(position).addPoints(cost);
            cardInfo.put();

        } else {
            System.out.println("Please give the total cost of your purchase.");
            int cost = scanner.nextInt();

            System.out.println("Please give your card ID.");
            String givenID = scanner.next();

            int position = cardInfo.search(UUID.fromString(givenID));

            if (cardInfo.get(position).isTodayRedeemed() == false) {
                if (cardInfo.get(position).getPoints() >= cost) {
                    cardInfo.get(position).redeemPoints(cost);
                    cardInfo.get(position).setTodayRedeemed(true);
                    cardInfo.put();
                } else {
                    System.out.println("Only normal purchase possible.");
                    cardInfo.get(position).addPoints(cost);
                    cardInfo.put();
                }
            } else {
                System.out.println("Only normal purchase possible.");
                cardInfo.get(position).addPoints(cost);
                cardInfo.put();
            }
        }

        scanner.close();
    }
}
