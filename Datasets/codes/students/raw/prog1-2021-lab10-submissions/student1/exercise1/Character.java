package lu.uni.programming1.lab10.exercise1;

public class Character {
    private String name;
    private CharacterRole role;

    
    public Character(String name, CharacterRole role) {
        this.name = name;
        this.role = role;
    }
    public Character() {
        
    }

    public void setName(String name) throws LongNameException{
        if(name.length() > 20)
        throw new LongNameException(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRole(CharacterRole role) {
  
        this.role = role;
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
