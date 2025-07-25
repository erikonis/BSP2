package lu.uni.programming1.lab10.exercise3;

import java.util.UUID;

public class Game extends Software {

    private UUID ID;

    public Game(String name, int size, UUID ID)
    {
        super(name, size);
        this.ID = ID;
    }

    public void install(Disk disk){
       try {
           if(disk.getUser().ownsGameLicense(ID)) disk.install(this);
           else throw new InvalidLicense(this, disk);
       } catch (InvalidLicense e) {
           System.out.println(e.getGame().getName()+" cannot be installed to "+e.getDisk().getUser()+" because of missing license");
       }
    }
}
