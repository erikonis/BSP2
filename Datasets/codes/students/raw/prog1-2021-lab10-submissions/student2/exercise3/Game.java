package lu.uni.programming1.lab10.exercise3;

import java.util.UUID;

public class Game extends Software {

    private UUID license = UUID.randomUUID();
    private Software software;
    private User user;

    public Game(UUID license, String name, int size) {
        super(name, size);
        this.license=license;   
    }
    public void add(Disk disk){
        for (User user : disk){

        }
    }
    
}
