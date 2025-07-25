import java.util.UUID;

public class Game extends Software {

    private UUID license;

    public Game(String name, int size, UUID license) {
        super(name, size);
        this.license = UUID.randomUUID();
    }

    public UUID getLicense() {
        return license;
    }

    @Override
    public void install(Disk disk) throws Exception {
            if (((disk.getUser()).ownsGameLicense(license))!=true){
                throw new Exception();
            }    
        super.install(disk);
    }
    
}
