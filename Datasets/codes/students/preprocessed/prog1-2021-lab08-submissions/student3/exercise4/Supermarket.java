import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Supermarket {

	private Map<LocalDate, List<LoyaltyCard>> paidWithLoyaltyCard;

	public Supermarket() {
		this.paidWithLoyaltyCard = new HashMap<>();
	}

	public void buy(double amount, LoyaltyCard card) {
		card.buy(amount);
	}

	public void redeem(double amount, LoyaltyCard card) {
		LocalDate today = LocalDate.now();

		// add list for today if not yet created
		if (!this.paidWithLoyaltyCard.containsKey(today)) {
			this.paidWithLoyaltyCard.put(today, new ArrayList<LoyaltyCard>());
		}

		// retrieve list of cards having redeemed today
		List<LoyaltyCard> cardsRedeemedToday = this.paidWithLoyaltyCard.get(today);

		// check whether card has not yet redeemed today
		if (!cardsRedeemedToday.contains(card)) {
			// check whether enough points on card
			if (card.canRedeem(amount)) {

				card.redeem(amount);
				cardsRedeemedToday.add(card);

			} else {
				System.out.println(card + ": Not enough points on the card.");
			}
		} else {
			System.out.println(card + ": This card has already redeemed today.");
		}
	}

	public static void main(String[] args) {

		Supermarket cactus = new Supermarket();

		LoyaltyCard Card1 = new LoyaltyCard();

		cactus.buy(55, Card1);
		cactus.buy(499.99, Card1);
		cactus.buy(79.99, Card1);
		cactus.buy(20, Card1);

		cactus.redeem(50, Card1);
		//cactus.redeem(100, Card1);

		LoyaltyCard Card2 = new LoyaltyCard(Card1.getUUID(), 0);
		cactus.redeem(1, Card2);

	}

}
