public class Main {
    public static void main(String[] args) {
        Character alice = new Character("Alice", 100);
        Character bob = new Character("Bob", 50);

        Action jump = new JumpAction(alice);
        Action ability = new AbilityAction(bob, "Roar");
        Action heal = new TargetableAbilityAction(bob, "Heal", bob, 20);
        Action attack = new TargetableAbilityAction(alice, "Fireball", bob, -60);

        jump.execute();
        ability.execute();
        heal.execute();
        attack.execute();

        Logger.getInstance().printLogs();
    }
}