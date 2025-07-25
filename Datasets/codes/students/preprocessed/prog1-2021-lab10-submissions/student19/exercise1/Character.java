import lu.uni.programming1.lab10.exercise1.exceptions.EmptyNameException;
import lu.uni.programming1.lab10.exercise1.exceptions.TooLongNameException;
import lu.uni.programming1.lab10.exercise1.exceptions.UnkownCharacterRoleException;

public class Character {
    private String name;
    private CharacterRole role;

    // You may edit this constructor if you so wish
    public Character(String name, String role) throws TooLongNameException, EmptyNameException, UnkownCharacterRoleException {
        if(name.length() > 20){
            System.out.println(new TooLongNameException(name).getMessage());
        }else if(name.length() == 0){
            System.out.println(new EmptyNameException(name).getMessage());
        }else{
            this.name = name;
        }
        if(role.equals(CharacterRole.DAMAGE.name()) || role.equals(CharacterRole.HEALER.name()) || role.equals(CharacterRole.TANK.name())){
            this.role = CharacterRole.valueOf(role);
        }else{
            System.out.println(new UnkownCharacterRoleException().getMessage());
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
