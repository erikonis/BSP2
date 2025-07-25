package src.lu.uni.programming1.lab9.Exercise2;

public class Launcher {

    public static void main(String[] args) {

       

        Character p1 = new  Character("Batman",200,200);
        Character p2 = new Character("Joker",180,180);

      


        Targetable heal = new Targetable(p2,p2, "Potion", 50 );
        Targetable p1damage = new Targetable(p2,p1, "BatShuriken", -90);
        Targetable punch = new Targetable(p1,p2, "Punch", -50);
        Targetable p2damage = new Targetable(p1,p2, "Chainsaw", -150);
        Jump jump = new Jump(p2);
        
        jump.execute(p2);
        p1damage.execute(p1damage,p2,p1);
        punch.execute(punch,p1,p2);
        heal.execute(heal,p2,p2);
        p1damage.execute(p1damage,p2,p1);
        p2damage.execute(p2damage,p1,p2);
        p2damage.execute(p2damage,p1,p2);
        
        


    }

      
   
    
}

    
    

