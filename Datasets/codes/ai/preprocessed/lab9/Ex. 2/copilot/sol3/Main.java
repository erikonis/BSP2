public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        EventManager.getInstance().subscribe(logger);

        Character character1 = new Character("Hero", 100);
        Character character2 = new Character("Villain", 80);

        Action jump = new Jump(character1);
        jump.execute();

        Action ability = new Ability(character1, "Fireball");
        ability.execute();

        Action targetableAbility = new TargetableAbility(character1, "Heal", character1, 20);
        targetableAbility.execute();

        Action attack = new TargetableAbility(character2, "Dark Strike", character1, -50);
        attack.execute();

        logger.printLogs();
    }
}