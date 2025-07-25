public class Main {
    public static void main(String[] args) {
        // Create characters
        Character cloud = new Character("Cloud", 100);
        Character tifa = new Character("Tifa", 80);
        Character aerith = new Character("Aerith", 90);

        // Create actions
        JumpAction jumpCloud = new JumpAction(cloud);
        AbilityAction fireCloud = new AbilityAction(cloud, "Fire");
        TargetableAbilityAction attackTifa = new TargetableAbilityAction(cloud, "Attack", tifa, 20);
        TargetableAbilityAction healAerith = new TargetableAbilityAction(tifa, "Heal", aerith, -15);
        TargetableAbilityAction selfBuff = new TargetableAbilityAction(cloud, "Buff", cloud, -10);

        // Execute actions and log events
        jumpCloud.execute();
        fireCloud.execute();
        attackTifa.execute();
        healAerith.execute();
        selfBuff.execute();
        System.out.println(cloud);
        System.out.println(tifa);
        System.out.println(aerith);

        // Simulate kill
        attackTifa = new TargetableAbilityAction(cloud, "Attack", tifa, 100);
        attackTifa.execute();
        if (!tifa.isAlive()) {
            Logger.getInstance().logEvent(cloud.getName() + " killed " + tifa.getName());
        }

        // Simulate self kill
        TargetableAbilityAction selfDamage = new TargetableAbilityAction(cloud, "Suicide", cloud, 200);
        selfDamage.execute();
        if (!cloud.isAlive()) {
            Logger.getInstance().logEvent(cloud.getName() + " killed themself.");
        }

        // Print all logs
        Logger.getInstance().printAllLogs();
    }
}