import javax.swing.*;

public class Actions {
    static int chosenAction;

    static Action action;
    
    static Action ability;

    static Action targetable;

    static boolean Target;
    
    public static Action getAction(){
        return action;
    }

    public static void setAction(Action action){
        Actions.action = action;
    }

    public static void setTarget(boolean Target){
        Actions.Target = Target;
    }

    public static int getChosenAction(){
        return chosenAction;
    }

    public static void setChoosenAction(int chosenAction){
        Actions.chosenAction = chosenAction;
    }

    public class Targetable{

    }

    public class Jump{
        static Action jump;

        public static Action getJump(){
            return jump;
        }
    }

    public class Logs{
        public void printHP(){
            System.out.println(Character.getName() +" : " + Character.getHP() +"/"+ Character.getMaxHP());
        }

        public static void printHPDifference(){
            System.out.println("- Logs - " + Character.getName() + " has lost "+ Ability.getRandomHP()+ " health points."); 
        }

        public static void PrintJump(){
            System.out.println("- Logs - " + Character.getName() + " jumped");
        }

        public static void PrintAbility(){
            System.out.println("- Logs - "+ Character.getName() + " used his ability");
        }

        public static void PrintTargetable(){
            if(Actions.Target()){
                System.out.println("- Logs - "+ Character.getName() + " is now targetable");
            }
            else{
                System.out.println("- Logs - "+ Character.getName() + " isn't targetable");
            }
        }
    }

    public class Ability{
        static int randomHP = (int)(Math.random() * 16);
        static Logs logs = new Logs();
        static int randomHP2 = (int)(Math.random() * 16);
        public static int getRandomHP() {
            return randomHP;
        }

        public static int UpdateHP(){
            int rhp = Character.getHP() - randomHP;
            Character.setHP(rhp);
            Logs.printHPDifference();
            logs.printHP();
            return rhp;
        }
    }
    

    public static void FetchAction(){
        switch(chosenAction){
            
            case 1: Logs.printHP();
            setAction(Jump.getJump());

            break;

            case 2:ability.getHP();
            Ability.UpdateHP();
            Logs.printAbility();
            setAction(ability);

            break;

            case 3:
            if(Target){
                setTarget(false);

            }
            else{setTarget(true);
            }

            Logs.PrintTargetable();
            setAction(targetable);

            break;
        }
    }

    public static boolean Target() {
        return false;
    }
}
