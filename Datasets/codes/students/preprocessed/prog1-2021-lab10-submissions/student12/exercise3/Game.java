import java.util.UUID;

public class Game extends Software {

    private UUID gameUUID;

    public Game(String name, int size) {
        super(name, size);
        this.gameUUID = UUID.randomUUID();;
    }

    public UUID getgameLicense() {
        return gameUUID;
    }
    
    @Override
    public void install(Disk disk) throws Exception{
        Boolean ownsGameLicense = disk.getUser().ownsGameLicense(this.gameUUID);
        if(ownsGameLicense){
            super.install(disk);
        }else{
            throw new MissingGameLicenseException("Could not find "+getName()+" game license for "+disk.getUser());
        }
    }
}
