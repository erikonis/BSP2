public class Character {
    private String name;
    private CharacterRole role;

    // You may edit this constructor if you so wish
    public Character(String name, CharacterRole role) throws IndexOutOfBoundsException {
        // check if the name is not empty and the length of name is under 20 chars
        if (!name.isEmpty() && name.length() < 20) {
            this.name = name;
            this.role = role;
        }
        // check if only the name is empty
        else if (name.isEmpty()) {
            throw new IndexOutOfBoundsException("Your name is  empty");
        }
        // check if the name is not to long
        else if (name.length() > 20) {
            throw new IndexOutOfBoundsException("Your name is to long");
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
