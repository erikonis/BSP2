import java.util.UUID;

public class Game extends Software {

    private UUID license;
    public Game(String name, int size) {
        super(name, size);
        license = UUID.randomUUID();

    }
    
    public UUID getuuid()
    {
        return license;
    }
    public void install( User user, Disk disk)
    {
        if(user.ownsGameLicense(license))
        {
            Game game= new Game(super.getName(),super.getSize());
            disk.install(game);
        }
    }
    
}
