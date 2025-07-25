import java.util.UUID;

public class Game extends Software {
    private UUID license;

    public Game(String name, int size) {
        super(name, size);
        license = UUID.randomUUID();
    }

    public void install(Disk disk) throws Exception {
        if (disk.getUser().ownsGameLicense(license))
            super.install(disk);
        else
            throw new Exception();
    }

    public UUID getLicense() {
        return license;
    }

}
