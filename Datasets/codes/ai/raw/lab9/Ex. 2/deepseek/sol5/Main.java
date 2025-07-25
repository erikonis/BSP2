public class Main {
    public static void main(String[] args) {
        // Create characters
        Character cloud = new Character("Cloud", 100);
        Character sephiroth = new Character("Sephiroth", 150);

        // Create and execute actions
        new JumpAction(cloud).execute();
        new AbilityAction(sephiroth, "Shadow Flare").execute();
        
        // Targetable actions
        new TargetableAbilityAction(
            cloud, 
            sephiroth, 
            "Braver", 
            30).execute();
        
        new TargetableAbilityAction(
            sephiroth, 
            cloud, 
            "Heartless Angel", 
            -90).execute();
        
        // Suicide action
        new TargetableAbilityAction(
            cloud, 
            cloud, 
            "Self-destruct", 
            -100).execute();
        
        // Failed action (no target)
        new TargetableAbilityAction(
            sephiroth, 
            null, 
            "Supernova", 
            50).execute();

        // Print all logs
        GameLogger.getInstance().printLogs();
    }
}