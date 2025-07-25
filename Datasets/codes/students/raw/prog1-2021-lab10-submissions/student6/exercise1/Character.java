package lu.uni.programming1.lab10.exercise1;

public class Character {
    private String name;
    private CharacterRole role;

    // You may edit this constructor if you so wish
    public Character(String name, CharacterRole role) throws RoleException,NameException{

        try {
            checkName(name);
        } catch (NameException e) {
            throw e;
        }
        
        try {
            checkRole(role);
        } catch (RoleException e) {
            throw e;
        }

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
        } else if (!name.equalsIgnoreCase(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return name + " (" + role + ")";
    }

    public static void checkName (String str) throws NameException {
        if(str.length()>20)
            throw new NameException("Invalid character name (name is too long - max 20 characters): "+str);
        else if(str.isBlank())
            throw new NameException("Invalid character name (name can't be empty)");
    }

    public static void checkRole (CharacterRole role) throws RoleException {
        if(role == null)
            throw new RoleException("Unknown character role."); 
    }

}
