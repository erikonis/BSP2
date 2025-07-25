public class Main {
    public static void main(String[] args) {
        // Initialize with fluent interface
        new GameEngine()
            .registerCharacter(new Character("Warrior", 100, 100, List.of()))
            .registerCharacter(new Character("Mage", 80, 80, List.of()))

            // Execute actions
            .execute(new GameAction.Jump(
                new Character("Warrior", 100, 100, List.of()),
                Instant.now()
            ))
            .execute(new GameAction.TargetedAbility(
                new Character("Mage", 80, 80, List.of()),
                new Character("Warrior", 100, 100, List.of()),
                "Fireball",
                -30,
                Instant.now()
            ))
            .execute(new GameAction.TargetedAbility(
                new Character("Warrior", 100, 100, List.of()),
                null, // Invalid target
                "Heal",
                20,
                Instant.now()
            ))
            .execute(new GameAction.TargetedAbility(
                new Character("Mage", 80, 80, List.of()),
                new Character("Mage", 80, 80, List.of()),
                "Self Destruct",
                -100,
                Instant.now()
            ))

            // Print results
            .printLogs();
    }
}