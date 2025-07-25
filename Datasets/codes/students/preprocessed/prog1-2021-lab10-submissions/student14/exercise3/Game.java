import java.util.UUID;

public class Game extends Software {
    private UUID ID;
    private String license;

    public Game(String name, int size, UUID iD, String license) {
        super(name, size);
        // unique ID
        ID = UUID.randomUUID();
        this.license = license;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID iD) {
        ID = iD;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "Game [ID=" + ID + ", license=" + license + "]";
    }

}