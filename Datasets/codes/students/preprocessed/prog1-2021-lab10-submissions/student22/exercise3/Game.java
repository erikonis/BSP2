import java.util.UUID;

public class Game extends Software {
    private UUID license;
    private User user;

    public Game(String name, int size) {
        super(name, size);
    }

    public void install(Disk disk) throws Exception{
        if(user.ownsGameLicense(license)){
            super.install(disk);
        } else {
            System.out.println("Installation not possible: user does not own the correct license for the game.");
        }
        
    }
    
}
