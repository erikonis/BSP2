public class GameSimulator {
    public static void main(String[] args) {
        Character hero = new Character("Cloud", 100);
        Character villain = new Character("Sephiroth", 120);

        Action jump = new JumpAction(hero);
        Action slash = new AbilityAction(villain, "Dark Slash");
        Action fireball = new TargetableAbilityAction(hero, "Fireball", villain, -40);
        Action heal = new TargetableAbilityAction(hero, "Potion", hero, +30);
        Action suicide = new TargetableAbilityAction(villain, "Despair", villain, -200);
        Action fail = new TargetableAbilityAction(hero, "Void", null, -10); // Should fail

        jump.execute();
        slash.execute();
        fireball.execute();
        heal.execute();
        fail.execute();
        suicide.execute();

        Logger.getInstance().printLogs();
    }
}
