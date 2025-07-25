

public class Launcher {
    public static void main(String[] args) {
        Character c = new Character("Sephiroth", 100);
        Character t = new Character("Cloud Strife",100);

        Logger l = Logger.getLogs();

        Record r = new Record(c, t);

        Targetable darkAttack = new Targetable("Dark Attack", c, t, -20);
        Targetable groupHeal = new Targetable("Group Heal", c, t, 15);
        Targetable fireball = new Targetable("Fireball", c, t, -25);
        Targetable freeze = new Targetable("Freeze", c, t, -5);
        Targetable instantDeath = new Targetable("instant Death", c, t, (-1)*t.getMaxHealthcounter());
        Targetable ups = new Targetable("Mega Fireball", c, c, -99);
        Ability selfHeal = new Targetable("Self Heal", c, c, 50);
        Jump j = new Jump();
        Targetable suicid = new Targetable("instant Death", c, c, (-1)*t.getMaxHealthcounter()); 

        l.storingEvents(r.action(darkAttack));
        l.storingEvents(r.action(groupHeal));
        l.storingEvents(r.action(fireball));
        l.storingEvents(r.action(freeze));
        l.storingEvents(r.action(instantDeath));
        l.storingEvents(r.action(ups));
        l.storingEvents(r.action(selfHeal));
        l.storingEvents((r.action(j,c)));
        l.storingEvents((r.action(suicid)));
        
        l.printEvents();

    }
}
