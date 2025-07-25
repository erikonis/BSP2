public class Main {
    public static void main(String[] args) {
        Character alice = new Character("Alice", 100);
        Character bob = new Character("Bob", 80);

        Action jump = new JumpAction(alice);
        Action ability = new AbilityAction(bob, "Berserk");
        Action heal = new TargetableAbilityAction(alice, alice, "Heal", 20);
        Action fireball = new TargetableAbilityAction(bob, alice, "Fireball", -30);
        Action misfire = new TargetableAbilityAction(bob, null, "Ghost Strike", -40);

        jump.execute();
        ability.execute();
        heal.execute();
        fireball.execute();
        misfire.execute();

        Logger.getInstance().printLogs();
    }
}