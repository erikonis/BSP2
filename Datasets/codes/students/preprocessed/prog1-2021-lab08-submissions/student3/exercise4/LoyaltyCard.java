import java.util.UUID;

public class LoyaltyCard {

	private String uuid;
	private int points;

	public LoyaltyCard(String uuid, int points) {
		this.uuid = uuid;
		this.points = points;
	}

	public LoyaltyCard() {
		this(UUID.randomUUID().toString(), 0);
	}

	public String getUUID() {
		return this.uuid;
	}

	public int getPoints() {
		return this.points;
	}

	public void buy(double amount) {
		this.points += Math.floor(amount / 10);
		System.out.println(String.format("%s: bought for " + Colors.ANSI_GREEN + "%.2f EUR" + Colors.ANSI_RESET + ", now %d points.", this, amount, this.points));
	}

	public boolean canRedeem(double amount) {
		return this.points >= (int) Math.ceil(amount);
	}

	public void redeem(double amount) {
		if (this.canRedeem(amount)) {
			this.points -= (int) Math.ceil(amount);
			System.out.println(String.format("%s: " + Colors.ANSI_GREEN + "%.2f EUR"+Colors.ANSI_RESET +" redeemed, now %d points.", this, amount, this.points));
		}
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == this) {
			return true;
		}

		if (!(obj instanceof LoyaltyCard)) {
			return false;
		}

		LoyaltyCard lc = (LoyaltyCard) obj;

		return this.uuid.equals(lc.getUUID());
	}

	@Override
	public int hashCode() {
		return this.uuid.hashCode();
	}

	@Override
	public String toString() {
		return "Loyalty Card No. "+Colors.ANSI_GREEN + this.uuid +Colors.ANSI_RESET;
	}

}