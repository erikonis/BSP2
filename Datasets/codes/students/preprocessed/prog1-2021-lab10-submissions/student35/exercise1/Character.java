public class Character {
    private String name;
    private CharacterRole role;
    
    public Character(String name, String role) throws NameTooLongException, NameEmptyException, UnknownRole{
       this.setName(name);
       this.setRole(role);
    }

    public String getName() {
        return name;
    }

    public CharacterRole getRole() {
        return role;
    }

    public void setName(String answerName) throws NameTooLongException, NameEmptyException {
        if (answerName.length() > 20) {
            throw new NameTooLongException();
        }
        if (answerName.length()<=0) {
            throw new NameEmptyException();
        }
        this.name = answerName;
    }
      

    public void setRole(String answerRole) throws UnknownRole{
        if (answerRole.equals("DAMAGE")) {
            this.role = CharacterRole.DAMAGE;
        }else if (answerRole.equals("TANK")) {
            this.role = CharacterRole.TANK;
        }else if (answerRole.equals("HEALER")) {
            this.role = CharacterRole.HEALER;
        }else{
            throw new UnknownRole();
        }
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
