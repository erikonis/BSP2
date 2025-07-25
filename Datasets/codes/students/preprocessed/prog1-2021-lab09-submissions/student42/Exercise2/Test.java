import java.util.ArrayList;

public class Test {

    public static ArrayList<Event>log= new ArrayList<>();
    public static void main(String[] args) {
        Character sara = new Character("Sara", 567);
        Character lucas= new Character("Lucas", 589);
        Character abdo = new Character("Abdollah", 250);
        Ability a1= new Ability(sara, "SCREAM!");
        Ability a2= new Ability(lucas, "Use Linux");
        Targetable q1= new Targetable(sara, "Dark Binding", 200);
        Targetable e1= new Targetable(sara, "Black Shield", -110,true);
        Targetable w1= new Targetable(sara, "Poison", 300,true);
        Targetable q2= new Targetable(lucas, "Shock Blast", 250);
        Jump j1= new Jump(sara);
        Jump j2= new Jump(lucas);
        Jump j3 = new Jump(abdo);
        
        j1.execute();
        j2.execute();
        a1.execute();
        a2.execute();
        q2.execute(abdo);
        w1.execute(abdo);
        j3.execute();
        q1.execute();
        q1.execute(lucas);
        q1.execute(lucas);
        q1.execute(lucas);
        q1.execute(lucas);
        w1.execute(sara);
        w1.execute(sara);
        e1.execute(sara);
       
        Logger.print();

    }   
    
}
