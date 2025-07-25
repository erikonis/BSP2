public class Main {
    public static void main(String[] args) {
        Character cloud = new Character("Cloud", 100);
        Character sephiroth = new Character("Sephiroth", 80);

        Action jump = new JumpAction(cloud);
        Action slash = new AbilityAction(sephiroth, "Dark Slash");
        Action heal = new TargetableAbilityAction(cloud, cloud, "Heal", +30);
        Action attack = new TargetableAbilityAction(sephiroth, cloud, "Dark Blade", -50);
        Action failAttack = new TargetableAbilityAction(cloud, null, "Random Blast", -20);
        Action suicide = new TargetableAbilityAction(cloud, cloud, "Explosion", -150);

        jump.execute();
        slash.execute();
        heal.execute();
        attack.execute();
        failAttack.execute();
        suicide.execute();

        Logger.getInstance().printAllLogs();
    }
}