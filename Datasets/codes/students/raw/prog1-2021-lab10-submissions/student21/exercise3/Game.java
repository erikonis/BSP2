package lu.uni.programming1.lab10.exercise3;

import java.util.UUID;

public class Game extends Software {
    UUID license = UUID.randomUUID();

    public Game(String name, int size) {
        super(name, size);

    }

    @Override
    public void install(Disk disk) throws Exception {
        try {
            if (disk.getUser().ownsGameLicense(license)) {
                super.install(disk);
            } else
                throw new NoLicenseException();
        } catch (NoLicenseException e) {
            System.out.println("You fool! You have to buy the game legally. You don't own the license !");
        }

    }

}
