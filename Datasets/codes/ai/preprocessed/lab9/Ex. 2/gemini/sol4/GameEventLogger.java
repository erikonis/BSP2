import java.util.List;

public class GameEventLogger {
    public static void main(String[] args) {
        Character hero = new Character("Hero", 100);
        Character monster = new Character("Goblin", 50);

        List<Character> initialCharacters = List.of(hero, monster);
        GameEngine engine = new GameEngine(initialCharacters);

        System.out.println("Initial State:");
        engine.getCharacters().forEach(System.out::println);
        System.out.println();

        engine.executeCommand(new JumpCommand(hero));
        System.out.println();

        engine.executeCommand(new AbilityCommand(hero, "Basic Attack"));
        System.out.println();

        engine.executeCommand(new TargetableAbilityCommand(hero, "Strong Hit", "Goblin", 25));
        engine.getCharacters().forEach(System.out::println);
        System.out.println();

        engine.executeCommand(new TargetableAbilityCommand(hero, "Heal", "Hero", -10));
        engine.getCharacters().forEach(System.out::println);
        System.out.println();

        engine.executeCommand(new TargetableAbilityCommand(hero, "Weak Heal", null, -5));
        System.out.println();

        engine.executeCommand(new TargetableAbilityCommand(hero, "Final Blow", "Goblin", 100));
        engine.getCharacters().forEach(System.out::println);
        System.out.println();

        engine.executeCommand(new TargetableAbilityCommand(monster, "Self Destruct", "Goblin", 50));
        engine.getCharacters().forEach(System.out::println);
        System.out.println();

        engine.printLogs();
    }
}