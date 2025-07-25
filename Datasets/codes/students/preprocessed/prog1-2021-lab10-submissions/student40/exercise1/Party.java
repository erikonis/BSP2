import java.util.ArrayList;
import java.util.List;

public class Party {
    private int damage = 0;
    private int healer = 0;
    private int tank = 0;
    private List<Character> characters;

    Party() {
        characters = new ArrayList<>();
    }

    @Override
    public String toString() {
        String characterList = "";
        for (Character character : characters) {
            characterList += "- " + character + "\n";
        }
        return "\nParty (" + characters.size() + " members):\n" + characterList;
    }

    // Implement the body of this method (you can also modify the method's
    // signature...)
    public void add(Character character) throws PartyFullException, ExistingCharacterException, RoleLimitException{
        CharacterRole d = CharacterRole.DAMAGE;
        CharacterRole h = CharacterRole.HEALER;
        CharacterRole t = CharacterRole.TANK;

        for(int i=0; i<characters.size(); i++){
            Character c = characters.get(i);

            if(character.equals(c))
            throw new ExistingCharacterException();

            if(c.getRole().equals(d)){
                damage++;
            }else if(c.getRole().equals(h)){
                healer++;
            }else if(c.getRole().equals(t)){
                tank++;
            }
        }

        if(characters.size()>3)
        throw new PartyFullException();

        if(damage>1 || healer>0 || tank>0)
        throw new RoleLimitException();
        
        characters.add(character);

        damage = 0;
        healer = 0;
        tank = 0;
    }
}
