package lu.uni.programming1.lab10.exercise3;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Game extends Software{
    UUID licence;
    String name;
    double diskspace;
    static List<Game> games = new LinkedList<>();
    static Disk disk = new Disk();

    Game(UUID licence, double diskspace, String name) {
        this.licence = licence;
        this.diskspace = diskspace;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getDiskSpace() {
        return diskspace;
    }

    public void setDiskSpace(double diskSpace) {
        this.diskspace = diskSpace;
    }

    public static void Install(Game game){
        if(game.getDiskSpace() > disk.getMaxSpace()){
            System.out.println("impossible to install (" + game.getName() + ")");
        }
        else{
            try{
                game.setDiskSpace(game.diskspace);
                games.add(game);
            }catch (Exception e){
                System.out.println(e);
            }
                System.out.println(game.getName() + "is installed with success.");
        }
    }
}
