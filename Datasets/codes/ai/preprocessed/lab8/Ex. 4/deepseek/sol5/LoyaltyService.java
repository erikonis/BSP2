import model.*;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class LoyaltyService {
    private final Map<String, CustomerAccount> customerAccounts = new ConcurrentHashMap<>();
    private final List<RedemptionRecord> redemptionHistory = Collections.synchronizedList(new ArrayList<>());

    public void createCustomerAccount(String customerId) {
        customerAccounts.putIfAbsent(customerId, new CustomerAccount(customerId));
    }

    public void issueNewCard(String customerId, String cardNumber) {
        CustomerAccount account = customerAccounts.get(customerId);
        if (account == null) {
            throw new IllegalArgumentException("Customer account not found");
        }
        account.addCard(new LoyaltyCard(customerId, cardNumber, 0));
    }

    public void recordPurchase(String cardNumber, double purchaseAmount) {
        LoyaltyCard card = findCardByNumber(cardNumber);
        int pointsToAdd = (int) (purchaseAmount * 0.10);

        CustomerAccount account = customerAccounts.get(card.getCardId());
        account.getCards().remove(card);
        account.addCard(card.addPoints(pointsToAdd));
    }

    public boolean redeemPoints(String cardNumber, int pointsToRedeem) {
        LoyaltyCard card = findCardByNumber(cardNumber);

        if (!RedemptionValidator.canRedeem(card, pointsToRedeem, redemptionHistory)) {
            return false;
        }

        LoyaltyCard updatedCard = card.redeemPoints(pointsToRedeem);
        CustomerAccount account = customerAccounts.get(card.getCardId());
        account.getCards().remove(card);
        account.addCard(updatedCard);

        redemptionHistory.add(new RedemptionRecord(updatedCard, LocalDate.now(), pointsToRedeem));
        return true;
    }

    private LoyaltyCard findCardByNumber(String cardNumber) {
        return customerAccounts.values().stream()
                .flatMap(account -> account.getCards().stream())
                .filter(card -> card.getCardNumber().equals(cardNumber))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Card not found"));
    }

    public List<RedemptionRecord> getRedemptionHistory() {
        return Collections.unmodifiableList(redemptionHistory);
    }

    public CustomerAccount getCustomerAccount(String customerId) {
        return customerAccounts.get(customerId);
    }
}