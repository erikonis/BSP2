package lu.uni.programming1.lab9.exercise2;

import java.util.ArrayList;

public class Targetable {
    
    private int target;
    private ArrayList<Ability> abilityList;
    private int Effects;

    public Targetable(int Effects){
        this.Effects=Effects;
        abilityList = new ArrayList<>(Effects);
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public boolean add (Ability abilitys){
        if (abilityList.size() < Effects) {
            abilityList.add(abilitys);
            return true;
        }else return false;
    }

    public void use(int index){
        switch (index) {
            case 0:
                System.out.println("\n"+abilityList.get(index).getAbilityName()+" ability has been activated, speed increase by 15%");
                break;
            case 1:
                System.out.println("\n"+abilityList.get(index).getAbilityName()+" ability has been activated. +10HP ");
                break;
            case 2:
                System.out.println("\n"+abilityList.get(index).getAbilityName()+" ability used. -20HP");
                break;
            default:System.out.println("Error no ability in slot: "+ index);
                break;
        }
    }

    @Override
    public String toString() {
        String inv1="";
        for (int i = 0; i < abilityList.size(); i++) {
           inv1 += String.format("\n{%d} %s", i, abilityList.get(i)); 
        }
        return inv1;
    }
}
