import java.util.UUID;

import lu.uni.programming1.lab10.exercise3.exeptions.UserDontHaveLicenseException;

public class Game extends Software {
    private UUID identifier;

    public Game(String name, int size, UUID identifier) {
        super(name, size);
        this.identifier = identifier;
    }

    public UUID getIdentifier() {
        return identifier;
    }

    @Override
    public void install(Disk disk) throws Exception {
        if (!(disk.getUser().ownsGameLicense(identifier))) {
            throw new UserDontHaveLicenseException(this, disk.getUser());
        }

        super.install(disk);
    }

}
