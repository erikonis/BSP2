package lu.uni.programming1.lab10.exercise1;

import java.util.LinkedList;
import java.util.List;

public class Party {
    private int maxSize = 4;
    private int healers = 0, damage = 0, tanks = 0;
    private List<Character> list = new LinkedList<>();

    public int getMaxSize() {
        return maxSize;
    }

    public void Add(){
        if(healers > 1)
            System.out.println("too much healers for this party !");
        else if(damage > 1)
            System.out.println("too much damage for this party !");
        else if(tanks > 1)
            System.out.println("too much tanks for this party !");
        else if(list.size() > getMaxSize())
            System.out.println("too much party members.");

        else {
            try {
                list.add(Launcher.getCharacter());
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                System.out.println(Launcher.getCharacter().getName() + "( " + Launcher.getCharacter().getRole() + " )is added.");
                Launcher.provide();
            }
        }
    }

    public void View(){
        System.out.println("party : (" + list.size() + ")");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getName());
        }
        Launcher.provide();
    }
}
