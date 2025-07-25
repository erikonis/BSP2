public class GameEventLogger {
    public static void main(String[] args) {
        Character hero = new Character("Hero", 100);
        Character monster = new Character("Goblin", 50);

        System.out.println("Initial State:");
        System.out.println(hero);
        System.out.println(monster);
        System.out.println();

        Action jump = new JumpAction(hero);
        jump.execute();
        System.out.println();

        Action basicAttack = new AbilityAction(hero, "Basic Attack");
        basicAttack.execute();
        System.out.println();

        Action strongHit = new TargetableAbilityAction(hero, "Strong Hit", new SingleTarget(monster), 25);
        strongHit.execute();
        System.out.println(monster);
        System.out.println();

        Action healSelf = new TargetableAbilityAction(hero, "Heal", new SelfTarget(hero), -10);
        healSelf.execute();
        System.out.println(hero);
        System.out.println();

        Action weakHealNoTarget = new TargetableAbilityAction(hero, "Weak Heal", null, -5);
        weakHealNoTarget.execute();
        System.out.println();

        Action finalBlow = new TargetableAbilityAction(hero, "Final Blow", new SingleTarget(monster), 100);
        finalBlow.execute();
        System.out.println(monster);
        System.out.println();

        Action selfDestruct = new TargetableAbilityAction(monster, "Self Destruct", new SelfTarget(monster), 50);
        selfDestruct.execute();
        System.out.println(monster);
        System.out.println();

        Logger.getInstance().printLogs();
    }
}