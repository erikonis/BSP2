public class Character {
    private String name;
    private CharacterRole role;

    // You may edit this constructor if you so wish
    public Character(String name, String role) throws NameTooLongException, NameTooShortException, UnknownCharacterRoleException {
        if (name.length() <= 0) {
            throw new NameTooShortException(name);
        } else if (name.length() > 20) {
            throw new NameTooLongException(name);
        } else {
            this.name = name;
        }
        try {
            this.role = CharacterRole.valueOf(role);
        } catch (IllegalArgumentException illegalArgumentException) {
            throw new UnknownCharacterRoleException();
        }
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
