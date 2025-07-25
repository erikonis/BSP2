public class Main {
    public static void main(String[] args) {
        // Create characters
        Character warrior = new Character("Warrior", 100);
        Character mage = new Character("Mage", 80);
        
        // Test actions
        new JumpAction(warrior).execute();
        new AbilityAction(mage, "Fireball").execute();
        
        // Test targetable abilities
        new TargetableAbilityAction(warrior, "Heal", mage, 20).execute();
        new TargetableAbilityAction(mage, "Ice Blast", warrior, -30).execute();
        
        // Test failed action (no target)
        new TargetableAbilityAction(warrior, "Attack", null, -15).execute();
        
        // Test self-target
        new TargetableAbilityAction(mage, "Life Drain", mage, -50).execute();
        
        // Test killing blow
        new TargetableAbilityAction(warrior, "Final Strike", mage, -100).execute();
        
        // Test suicide
        new TargetableAbilityAction(warrior, "Self Destruct", warrior, -200).execute();
        
        // Print all logs
        GameLogger.getInstance().printLogs();
    }
}