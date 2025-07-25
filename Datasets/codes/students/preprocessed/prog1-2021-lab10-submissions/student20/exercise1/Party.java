import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<Character> characters;
    private int damage, tank, healer = 0;

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
    public void add(Character character) throws PartyCharacterAddException {
        CharacterRole role = character.getRole();
        for (Character character2 : characters) {
            if (character2.equals(character)) {
                throw new PartyCharacterAddException(character, "player already in party.");
            }
        }
        if (tank + damage + healer == 4) {
            throw new PartyCharacterAddException(character, "the party is full, no other characters can be added to it.");
        }
        switch (role) {
            case TANK:
                if (tank == 1) {
                    throw new PartyCharacterAddException(character, "the party has reached the limit for the role TANK");
                } 
                characters.add(character);
                tank++;
                break;

            case DAMAGE:
                if (damage == 2) {
                    throw new PartyCharacterAddException(character, "the party has reached the limit for the role DAMAGE");
                }
                characters.add(character);
                damage++;
                break;
            case HEALER:
                if (healer == 1) {
                    throw new PartyCharacterAddException(character, "the party has reached the limit for the role HEALER");
                }
                characters.add(character);
                healer++;
                break;
        }
    }
}
