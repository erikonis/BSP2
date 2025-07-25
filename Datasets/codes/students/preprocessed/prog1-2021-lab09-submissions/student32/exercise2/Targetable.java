import java.util.ArrayList;

public class Targetable extends Action{
    // private String name;
    private Actionlog log;
    private ArrayList<String> s = new ArrayList<String>();
    private Player targetplayer, caster;
    private Boolean dead;
    public Targetable(String name, int hpmod, Actionlog log) {
        super(name, hpmod, log);
        this.log = log;
        dead = false;
    }
    
    
    public void targetact(Player caster, Player targetplayer){
        this.caster = caster;
        this.targetplayer = targetplayer;
        if(caster.getCurrenthealth()!=0){
        targetplayer.modCurrenthealth(super.getHPmod());
        System.out.println(caster.getName()+" used "+super.getName()+" on "+targetplayer.getName());
        if(super.getHPmod()<0){System.out.println(targetplayer.getName()+"'s HP was reduced by "+Math.abs(super.getHPmod()));}
        if(super.getHPmod()>0){System.out.println(targetplayer.getName()+"'s HP was increased by "+super.getHPmod());}
        if(targetplayer.getCurrenthealth() == 0){
            if(targetplayer == caster){
            System.out.println(targetplayer.getName()+" caused their own HP hit 0!");}
            else{
            System.out.println(caster.getName()+" caused "+targetplayer.getName()+"'s HP to hit 0!");
            }
        }}
        else{
            System.out.println(caster.getName()+" is incapacitated and unable to act");
        }
        this.setTargetact();
        log.Addlog(this.getLogadd());
        
    }
    public void setTargetact(){
        // ArrayList<String> s = new ArrayList<String>();
        s.clear();
        if(dead == false){
        s.add((caster.getName()+" used "+super.getName()+" on "+targetplayer.getName()));
        if(super.getHPmod()<0){s.add((targetplayer.getName()+"'s HP was reduced by "+Math.abs(super.getHPmod())));}
        if(super.getHPmod()>0){s.add((targetplayer.getName()+"'s HP was increased by "+super.getHPmod()));}
        if(targetplayer.getCurrenthealth() == 0){
            if(targetplayer == caster){
            s.add((targetplayer.getName()+" caused their own HP hit 0!"));}
            else{
                s.add((caster.getName()+" caused "+targetplayer.getName()+"'s HP to hit 0!"));}}}
        else{
            s.add((caster.getName()+" is incapacitated and unable to act"));
            }}

    private ArrayList<String> getLogadd(){
        return s;
    }
}
