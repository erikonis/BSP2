import lu.uni.programming1.lab9.exercise2.Actions.Ability;
import lu.uni.programming1.lab9.exercise2.Actions.Jump;
import lu.uni.programming1.lab9.exercise2.Actions.Targetable;

public class Launcher {
   public static void main(String[] args) {
       Character p1 = new Character("Me", 10, 10);
       Character p2 = new Character("Not me", 10, 10);

        new Jump(p1).execute();
        new Ability(p1, "Self destruct", 10).execute();
        new Targetable(p1, p1, "Revive", true, -10).execute();
        new Targetable(p1, p2, "WouldYouPleaseDie?", false, 5).execute();

        ALogger.printLog();
        
   } 
}
