
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private String name;
    private List<UUID> ownedGameLicenses;

    public User(String name) {
        this.name = name;
        ownedGameLicenses = new ArrayList<>();
    }

    public boolean ownsGameLicense(UUID license) {
        return ownedGameLicenses.contains(license);
    }

    public void addGameLicense(UUID license) {
        if (!ownsGameLicense(license)) {
            ownedGameLicenses.add(license);
            System.out.println(this + " now owns the license " + license);
        }
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}
