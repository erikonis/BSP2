public class TargetableSelf {


    public TargetableSelf (Character ch1, Action action) {

         String targetselftemp = "Character " + ch1 + " " + action + " " + "themself";

        System.out.println(targetselftemp);

        Logger.logs.add(targetselftemp);

        ch1.setCurrentHealthCounter(ch1.getCurrentHealthCounter()-action.damageAmount);
    
    }
    
}
