package lu.uni.programming1.lab9.exercise2;

public class MainClass
{
    public static void main(String[] args) {

        Character c1 = new Character("Arnold", 325, 62);
        Character c2 = new Character("Aaya", 300, 32);
        new Targetable(c1, -3, c2);
        new Jump(c1);
        new Targetable(c1, 2, c1);
        new Ability(c1, "Fireball");
        System.out.println(Logger.print());
    }
}