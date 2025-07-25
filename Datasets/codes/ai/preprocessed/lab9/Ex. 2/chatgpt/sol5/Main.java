public class Main {
    public static void main(String[] args) {
        Character alice = new Character("Alice", 100);
        Character bob = new Character("Bob", 80);

        Action jumpAlice = new Jump(alice);
        Action healBob = new TargetableAbility(alice, "Heal", bob, 20);
        Action fireball = new TargetableAbility(bob, "Fireball", alice, -50);
        Action suicide = new TargetableAbility(alice, "Explosion", alice, -200);
        Action punch = new Ability(alice, "Punch");

        jumpAlice.execute();
        punch.execute();
        fireball.execute();
        healBob.execute();
        suicide.execute();

        Logger.getInstance().printLogs();
    }
}