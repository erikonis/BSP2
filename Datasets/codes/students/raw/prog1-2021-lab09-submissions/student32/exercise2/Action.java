package exercise2;

import java.util.ArrayList;

public class Action {
    private String name;
    private Player player;
    private int hpmod;
    private Boolean dead;
    private Actionlog log;
    private ArrayList<String> s = new ArrayList<String>();
    // private String effect;
    public Action(String name, int hpmod, Actionlog log) {
        this.name = name;
        this.hpmod = hpmod;
        this.log = log;
        dead = false;}

    public String getName() {
        return name;
    }

    // public String getEffect(){
    //     return effect;
    // }

    public int getHPmod(){
        return hpmod;
    }
    // public void setName(String name) {
    //     this.name = name;
    // }
    public void act(Player player){
        this.player = player;
        dead = false;
        if(player.getCurrenthealth()!=0){
            dead = false;
        player.modCurrenthealth(hpmod);
        System.out.println(player.getName()+" used "+name);
        if(hpmod<0){System.out.println(player.getName()+"'s HP was reduced by "+Math.abs(hpmod));}
        if(hpmod>0){System.out.println(player.getName()+"'s HP was increased by "+hpmod);}
        if(player.getCurrenthealth() == 0){
            System.out.println(player.getName()+"'s HP hit 0!");
        }}
        else{
            dead = true;
            System.out.println(player.getName()+" is incapacitated and unable to act");
        }
        this.setAct();
        log.Addlog(this.getLogadd());
    }
    public void setAct(){
        // ArrayList<String> s = new ArrayList<String>();
        s.clear();
        if(dead == false){
            s.add(player.getName()+" used "+name);
            if(hpmod<0){s.add(player.getName()+"'s HP was reduced by "+Math.abs(hpmod));}
            if(hpmod>0){s.add(player.getName()+"'s HP was increased by "+hpmod);}
            if(player.getCurrenthealth() == 0){
                s.add(player.getName()+"'s HP hit 0!");
            }}
            else{
                s.add(player.getName()+" is incapacitated and unable to act");
            }
    }

    private ArrayList<String> getLogadd(){
        return s;
    }
}
