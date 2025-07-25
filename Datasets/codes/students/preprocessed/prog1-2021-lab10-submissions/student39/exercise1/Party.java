import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<Character> characters;
    private int healer,tank,damage = 0;

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
    public void add(Character character) throws PartyFullException, AlreadyInPartyException {
        if(characters.size() == 4) {
            throw new PartyFullException();
        }
        else {
            if(characters.contains(character)) {
                throw new AlreadyInPartyException("Can't add" + character.getName() + "(" + character.getRole() + ") , they're already in it");
            }
            else if(character.getRole().equals(CharacterRole.TANK) && tank == 1 || character.getRole().equals(CharacterRole.HEALER) && healer == 1 || character.getRole().equals(CharacterRole.DAMAGE) && damage == 2) {
                throw new AlreadyInPartyException("Can't add" + character.getName() + "(" + character.getRole() + ") to party: the party has reached the limit for the role " + character.getRole());
            }
            else {
                characters.add(character);
                switch(character.getRole()) {
                    case DAMAGE:
                        damage++;
                        break;
                    case HEALER:
                        healer++;
                        break;
                    case TANK:
                        tank++;
                        break;
                    default:
                        System.out.println("ERROR");
                }
                System.out.println("Added" + character.getName() + "(" + character.getRole() + ") to party 0.");
            }
        }
    }
}
