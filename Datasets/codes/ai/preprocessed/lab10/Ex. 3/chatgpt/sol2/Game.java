import java.util.Objects;

public class Game extends Software {
    private final String license;

    public Game(String name, String license) {
        super(name);
        this.license = license;
    }

    public String getLicense() {
        return license;
    }

    @Override
    public InstallStatus install(User user, Disk disk) throws GameInstallException {
        if (!user.getLicenses().contains(license)) {
            throw new GameInstallException(this, user);
        }
        return disk.installSoftware(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Game)) return false;
        Game other = (Game) obj;
        return Objects.equals(getName(), other.getName()) &&
               Objects.equals(license, other.license);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), license);
    }
}