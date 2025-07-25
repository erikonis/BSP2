public class Main {
    public static void main(String[] args) {
        // define some charcters
        Character character1 = new Character("Taulant", 100, 80);
        Character character2 = new Character("Max", 100, 70);
        Character character3 = new Character("Amar", 100, 40);
        // define some actions
        Jump jump1 = new Jump();
        Targetable targetable1 = new Targetable("qwertz", 20);
        Ability ability1 = new Ability("Bazinga");
        // actions
        jump1.command(character1);
        jump1.command(character2);
        jump1.command(character3);
        ability1.command(character1);
        ability1.command(character3);
        // attack 4 times with a damage of 20
        // taulant dies -> 4*20=80 AND 80 is the current life of taulant
        targetable1.command(character2, character1);
        targetable1.command(character2, character1);
        targetable1.command(character2, character1);
        targetable1.command(character2, character1);
        // output
        System.out.println("******************************");
        System.out.println(Log.printText());
        System.out.println("******************************");

    }
}