package lu.uni.programming1.lab9.exercise2;

public class Launcher {

    public static void main(String[] args) {

        Logger log = new Logger();

        // Grunbeld character + abilities.
        Character grunbeld = new Character("Grunbeld", 100);
        Jump grunjump = new Jump(grunbeld);
        Ability perception = new Ability(grunbeld, "Perception");
        Targetable fireball = new Targetable(grunbeld, "Fireball", 50);

        // Guts character + abilities.

        Character guts = new Character("Guts", 100);
        Jump gutsjump = new Jump(guts);
        Ability intimidation = new Ability(guts, "Intimidation");
        Targetable baseheal = new Targetable(guts, "Base Heal", -50);

        // Testing :
        gutsjump.Execute(log);
        grunjump.Execute(log);
        
        perception.Execute(log);
        intimidation.Execute(log);

        // Guts falls to 50 HP.
        fireball.Execute(log, guts);
        // Guts regains 50 HP.
        baseheal.Execute(log, guts);
        // Guts falls to 50 HP.
        fireball.Execute(log, guts);
        // Guts falls to 0 HP. Guts dies.
        fireball.Execute(log, guts);
       
        System.out.println("\n");
        log.PrintLog();

    }
    
}
