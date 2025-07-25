import java.util.List;

public class GameEventLogger {
    public static void main(String[] args) {
        Character hero = new Character("Hero", 100);
        Character monster = new Character("Goblin", 50);

        List<Character> currentCharacters = new java.util.ArrayList<>(List.of(hero, monster));

        System.out.println("Initial State:");
        currentCharacters.forEach(System.out::println);
        System.out.println();

        Action jump = new JumpAction(hero);
        ActionResult jumpResult = jump.execute(currentCharacters);
        Logger.getInstance().log(new Effect() { // Anonymous effect for simple actions
            @Override
            public String log(Character source, Character target) {
                return "[" + getTimestamp().format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "] ACTION: " + jump.getUser().getName() + " performed '" + jump.getDescription() + "'.";
            }

            @Override
            public java.time.LocalDateTime getTimestamp() {
                return java.time.LocalDateTime.now();
            }
        }, hero, null);
        currentCharacters = jumpResult.newCharacters();
        System.out.println();

        Action basicAttack = new AbilityAction(hero, "Basic Attack");
        ActionResult attackResult = basicAttack.execute(currentCharacters);
        Logger.getInstance().log(new Effect() {
            @Override
            public String log(Character source, Character target) {
                return "[" + getTimestamp().format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "] ACTION: " + basicAttack.getUser().getName() + " performed '" + basicAttack.getDescription() + "'.";
            }

            @Override
            public java.time.LocalDateTime getTimestamp() {
                return java.time.LocalDateTime.now();
            }
        }, hero, null);
        currentCharacters = attackResult.newCharacters();
        System.out.println();

        TargetableAbilityAction strongHit = new TargetableAbilityAction(hero, "Strong Hit", "Goblin", 25);
        ActionResult strongHitResult = strongHit.execute(currentCharacters);
        strongHitResult.effects().forEach(effect -> Logger.getInstance().log(effect, hero, strongHit.getTarget(currentCharacters)));
        currentCharacters = strongHitResult.newCharacters();
        currentCharacters.forEach(System.out::println);
        System.out.println();

        TargetableAbilityAction healSelf = new TargetableAbilityAction(hero, "Heal", "Hero", -10);
        ActionResult healResult = healSelf.execute(currentCharacters);
        healResult.effects().forEach(effect -> Logger.getInstance().log(effect, hero, healSelf.getTarget(currentCharacters)));
        currentCharacters = healResult.newCharacters();
        currentCharacters.forEach(System.out::println);
        System.out.println();

        TargetableAbilityAction weakHealNoTarget = new TargetableAbilityAction(hero, "Weak Heal", null, -5);
        ActionResult noTargetResult = weakHealNoTarget.execute(currentCharacters);
        noTargetResult.effects().forEach(effect -> Logger.getInstance().log(effect, hero, weakHealNoTarget.getTarget(currentCharacters)));
        currentCharacters = noTargetResult.newCharacters();
        System.out.println();

        TargetableAbilityAction finalBlow = new TargetableAbilityAction(hero, "Final Blow", "Goblin", 100);
        ActionResult finalBlowResult = finalBlow.execute(currentCharacters);
        finalBlowResult.effects().forEach(effect -> Logger.getInstance().log(effect, hero, finalBlow.getTarget(currentCharacters)));
        currentCharacters = finalBlowResult.newCharacters();
        currentCharacters.forEach(System.out::println);
        System.out.println();

        TargetableAbilityAction selfDestruct = new TargetableAbilityAction(monster, "Self Destruct", "Goblin", 50);
        ActionResult selfDestructResult = selfDestruct.execute(currentCharacters);
        selfDestructResult.effects().forEach(effect -> Logger.getInstance().log(effect, monster, selfDestruct.getTarget(currentCharacters)));
        currentCharacters = selfDestructResult.newCharacters();
        currentCharacters.forEach(System.out::println);
        System.out.println();

        Logger.getInstance().printLogs();
    }
}