package src.lu.uni.programming1.lab9.exercise2;

public class Launcher {
    public static void main(String[] args) {
        Character ragnok = new Character("Ragnok", 200);
        Character goblin = new Character("Goblin", 50);
        Character priest = new Character("Priest", 100);
        Targatable ragnokAtt = new Targatable(ragnok, goblin, 30);
        Targatable goblinAtt = new Targatable(goblin, ragnok, 10);
        Ability heal = new Ability(priest, "Heal");
        Targatable priestHeal = new Targatable(priest, goblin, heal);
        Jump goblinJump = new Jump(goblin);

        ragnokAtt.execute();
        ragnokAtt.execute();
        priestHeal.execute();
        priestHeal.execute();
        goblinJump.execute();

    }
}
