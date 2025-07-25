public class Launcher {    
    public static void main(String[] args) {
        
        Character p1 = new Character("Harry Potter", 550, 550);
        Character p2 = new Character("Lord Voldemort", 300, 300);

        Jump jump = new Jump();
        Ability ability = new Ability("Stand idle");
        Targetable t = new Targetable(p2, -50);
        Targetable t1 = new Targetable(p1, -50);
        Targetable t2 = new Targetable(p2, 50);
        Targetable t3 = new Targetable(p1, 50);
        Logs logs = new Logs();

        /*
        t.execute(p2,logs);
        jump.execute(p2,logs);
        ability.execute(p2,logs);
        t.execute(p2,logs);
        t2.execute(p2,logs);
        t.execute(p2,logs);
        t.execute(p2,logs);
        t.execute(p2,logs);
        t.execute(p2,logs);
        t.execute(p2,logs);
        t.execute(p2,logs); 
        */

        
        t.execute(p1, logs);
        jump.execute(p1, logs);
        t.execute(p1, logs);
        ability.execute(p1, logs);
        t2.execute(p1, logs);
        t.execute(p1, logs);
        t1.execute(p2, logs);
        t.execute(p1, logs);
        t3.execute(p1, logs);
        t.execute(p1, logs);
        t.execute(p1, logs);
        t.execute(p1, logs);
        t.execute(p1, logs);
        
           
        System.out.println(logs);

    }
}
