package service;

import model.RewardTier;

public class InputValidator {
    public static boolean isValidPledgeAmount(int amount) {
        return RewardTier.isValidAmount(amount);
    }
}