public class Main {
    public static void main(String[] args) {
        GameEngine engine = new GameEngine();
        
        // Create characters
        Character warrior = new Character("Warrior", 100);
        Character mage = new Character("Mage", 80);
        engine.registerCharacter(warrior);
        engine.registerCharacter(mage);
        
        // Execute commands
        engine.executeCommand(new JumpCommand(warrior));
        engine.executeCommand(new TargetedActionCommand(
            mage, warrior, "Fireball", -30
        ));
        engine.executeCommand(new TargetedActionCommand(
            warrior, mage, "Heal", 25
        ));
        engine.executeCommand(new TargetedActionCommand(
            mage, null, "Ice Blast", -15
        )); // Will fail
        engine.executeCommand(new TargetedActionCommand(
            warrior, mage, "Final Strike", -200
        )); // Will kill
        
        // Print logs
        engine.printEventLog();
    }
}