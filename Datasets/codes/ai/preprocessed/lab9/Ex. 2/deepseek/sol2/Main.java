public class Main {
    public static void main(String[] args) {
        // Initialize logger
        GameEventLogger logger = new GameEventLogger();

        // Create characters
        Character warrior = new Character("Warrior", 100);
        Character mage = new Character("Mage", 80);

        // Register listeners
        warrior.addListener(logger);
        mage.addListener(logger);

        // Create and execute actions
        new JumpAction(warrior, logger).execute();
        new AbilityAction(mage, "Fireball", logger).execute();

        // Targeted abilities
        new TargetedAbilityAction(warrior, "Heal", mage, 25, logger).execute();
        new TargetedAbilityAction(mage, "Ice Blast", warrior, -30, logger).execute();

        // Failed action
        new TargetedAbilityAction(warrior, "Attack", null, -15, logger).execute();

        // Self-target
        new TargetedAbilityAction(mage, "Life Drain", mage, -40, logger).execute();

        // Killing blow
        new TargetedAbilityAction(warrior, "Final Strike", mage, -200, logger).execute();

        // Suicide
        new TargetedAbilityAction(warrior, "Self Destruct", warrior, -150, logger).execute();

        // Print all logs
        logger.printLogs();
    }
}