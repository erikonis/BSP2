public class Main {
    public static void main(String[] args) {
        Character alice = new Character("Alice", 100);
        Character bob = new Character("Bob", 100);

        Action jump = new Jump(alice);
        Action ability = new Ability(bob, "Fireball");
        Action targetableAbility = new TargetableAbility(alice, bob, -30);

        jump.execute();
        ability.execute();
        targetableAbility.execute();

        Logger.getInstance().printLogs();
    }
}