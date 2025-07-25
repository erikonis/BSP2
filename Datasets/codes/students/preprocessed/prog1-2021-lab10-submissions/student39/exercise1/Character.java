public class Character {
    private String name;
    private CharacterRole role;

    // You may edit this constructor if you so wish
    public Character(String name, CharacterRole role) throws IllegalArgumentException, InvalidRoleException {
        
        if(name.length() > 20) {
            throw new IllegalArgumentException("(name is too long - max 20 characters): " + name);
        }
        else if(name == " ") {
            throw new IllegalArgumentException("(name can't be empty) ");
        }
        this.name = name;
        if(role != CharacterRole.DAMAGE && role != CharacterRole.HEALER && role != CharacterRole.TANK) {
            throw new InvalidRoleException();
        }
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
