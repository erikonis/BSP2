public class Main {
    public static void main(String[] args) {
        Character c1 = new Character("Peter", 20, 18);
        Jump jump = new Jump(c1);
        Character c2 = new Character("Lumi", 35, 35);
        Ability ability = new Ability(c2, "Healing Touch");
        Targetable targetable = new Targetable(c2, "Flame of Doom", 20, c1);
        Targetable targetable2 = new Targetable(c2, "Selfdestruct", 9999, c2);
        Logger log = new Logger();
        System.out.println(log.toString());
    }
}
