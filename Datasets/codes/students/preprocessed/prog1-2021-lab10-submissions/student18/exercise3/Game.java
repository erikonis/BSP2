import java.util.UUID;

import lu.uni.programming1.lab10.exercise3.Exceptions.UnknowIdException;

public class Game extends Software {
    private UUID id;

    public Game(String name, int size) {
        super(name, size);
        this.id = new UUID(0, 100);
    }

    public UUID getID() {return id;}

    @Override
    public void install(Disk disk) throws Exception {
        if (disk.getUser().ownsGameLicense(this.id)) {//install or just throws exception
            super.install(disk);
        } else {throw new UnknowIdException(disk.getUser().toString(), super.getName());}
    }
}
