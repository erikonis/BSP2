package lu.uni.programming1.lab10.exercise1;

public class Character {
    private String name;
    private CharacterRole role;

    public Character(String name, String ro) throws TooLong, EmptyName, UnknownChar {
        if (name.length() > 20)
            throw new TooLong();
        else if (name.length() == 0)
            throw new EmptyName();
        CharacterRole role = CharacterRole.stringToRole(ro);
        this.name = name;
        this.role = role;

    }

    public String getName() {
        return name;
    }

    public CharacterRole getRole() {
        return role;
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
        Character other = (Character) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return name + " (" + role + ")";
    }
}
