
public class TooManySpecificChar extends Exception{
    
    private CharacterRole role;

    public TooManySpecificChar(CharacterRole role) {
        this.role = role;
    }

    public CharacterRole getRole() {
        return role;
    }


    

    
}
