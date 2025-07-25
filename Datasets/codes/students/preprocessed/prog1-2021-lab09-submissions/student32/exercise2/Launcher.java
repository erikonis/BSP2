public class Launcher {
    public static void main(String[] args) {
        Actionlog log = new Actionlog();
        Action selfheal = new Action("Heal (Self)", 60, log);
        Action jump = new Action("Jump", 0, log);
        Action selfharm = new Action("Attack (Self)", -20, log);
        Targetable healother = new Targetable("Heal Other", 30, log);
        Targetable attack = new Targetable("Attack", -40, log);
        Player a = new Player(100, "A");
        Player b = new Player(40, "B");

        a.doAct(selfharm);
        b.doTarget(healother, a);
        b.doTarget(attack, a);
        a.doAct(selfheal);
        a.doTarget(attack, b);
        a.doAct(jump);
        b.doAct(jump);

        log.DisplayLog();
    }
}
