package lu.uni.programming1.lab10.exercise3;

import java.util.UUID;

public class Game extends Software{
    private UUID license;

    public Game(String name, int size) {
        super(name, size);
        license = UUID.randomUUID();
    }

    public UUID buy(){
        System.out.println("You bought the game!");
        return license;
    }
    
    public void install(Disk disk, boolean contains) throws Exception{
        if(contains){
            install(disk);
        }
        else{
            System.out.println(disk.getUser()+ " do not own the licence for " + super.getName());
        }
    }

    public UUID getLicense() {
        return license;
    }

}
