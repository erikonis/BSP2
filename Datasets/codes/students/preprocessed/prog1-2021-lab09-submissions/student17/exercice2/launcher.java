import javax.swing.plaf.basic.BasicListUI;

public class launcher {
    public static void main(String[] args) {
        Character character = new Character("Alex", 100);
        Character target = new Character("Jasko", 100);
        Targetable targetable = new Targetable(100, "fireball");
        Ability ability = new Ability("Rasengan");
        Jump jump = new Jump();

        targetable.execute(character);
        targetable.execute(character, target);
        ability.execute(character);
        jump.execute(character);
        targetable.execute(character, character);
        ability.execute(character);
        jump.execute(character);
    }
}
