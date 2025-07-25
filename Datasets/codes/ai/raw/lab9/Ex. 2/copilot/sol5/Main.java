public class Main {
    public static void main(String[] args) {
        Character character1 = new Character("Hero", 100);
        Character character2 = new Character("Villain", 80);

        Action jumpAction = new Jump(character1);
        Action abilityAction = new Ability(character1, "Fireball");
        
        Action targetableAbilityAction1 = new TargetableAbility(character1, character2, "Heal", 20);
        Action targetableAbilityAction2 = new TargetableAbility(character1, character2, "Attack", -90);

        jumpAction.execute();
        abilityAction.execute();
        
        targetableAbilityAction1.execute();
        
        targetableAbilityAction2.execute();
        
        System.out.println("Logs:");
        
        for (String log : Logger.getInstance().getLogs()) {
            System.out.println(log);
        }
        
       // Testing self-targeting ability
       Action selfTargetingAbilityAction = new TargetableAbility(character1, character1, "Self Heal", 10);
       selfTargetingAbilityAction.execute();
       
       System.out.println("Logs after self-targeting ability:");
       
       for (String log : Logger.getInstance().getLogs()) {
           System.out.println(log);
       }
   }
}
