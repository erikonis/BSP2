import java.util.UUID;

public class Game extends Software {

    private final UUID license = UUID.randomUUID();

    public Game(String name, int size) {
        super(name, size);
    }

    @Override
    public void install(Disk disk) throws Exception {
        if (disk.getUser().ownsGameLicense(license)) {
            super.install(disk);
        } else {
            throw new IllegalArgumentException("Cannot be installed for " + disk.getUser()
                    + " because you don't have a license to this game: " + getName());
        }
    }
}
