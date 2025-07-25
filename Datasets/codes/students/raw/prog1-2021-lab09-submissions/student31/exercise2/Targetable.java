package lu.uni.programming1.lab9.exercise2;

public class Targetable {


    public  Targetable (Character ch1, Character ch2, Action action) {

        String targettemp = "Character " + ch1.getName() + " " + Attack.name.toString() + " " + ch2.getName();

        System.out.println(targettemp.toString()); Logger.logs.add(targettemp);




        ch2.setCurrentHealthCounter(ch2.getCurrentHealthCounter()-action.damageAmount);
    
    }
    
}
