import java.util.ArrayList;
import java.util.List;

public class Party {
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

    public void add(Character character) throws PartyFullException, InvalidPartyCompositionException, CharacterAlreadyInPartyException {
        // Check if party is full
        if (characters.size() >= 4) {
            throw new PartyFullException("Party is already full (max 4 characters)");
        }

        // Check if character is already in this party
        if (characters.contains(character)) {
            throw new CharacterAlreadyInPartyException("Character " + character.getName() + " is already in this party");
        }

        // Check party composition rules
        int healers = 0;
        int tanks = 0;
        int damages = 0;

        for (Character c : characters) {
            switch (c.getRole()) {
                case HEALER: healers++; break;
                case TANK: tanks++; break;
                case DAMAGE: damages++; break;
            }
        }

        switch (character.getRole()) {
            case HEALER:
                if (healers >= 1) {
                    throw new InvalidPartyCompositionException("Party can only have 1 Healer");
                }
                break;
            case TANK:
                if (tanks >= 1) {
                    throw new InvalidPartyCompositionException("Party can only have 1 Tank");
                }
                break;
            case DAMAGE:
                if (damages >= 2) {
                    throw new InvalidPartyCompositionException("Party can only have 2 Damage dealers");
                }
                break;
        }

        // If all checks passed, add the character
        characters.add(character);
    }

    public List<Character> getCharacters() {
        return characters;
    }
}

// Custom Exceptions
class PartyFullException extends Exception {
    public PartyFullException(String message) {
        super(message);
    }
}

class InvalidPartyCompositionException extends Exception {
    public InvalidPartyCompositionException(String message) {
        super(message);
    }
}

class CharacterAlreadyInPartyException extends Exception {
    public CharacterAlreadyInPartyException(String message) {
        super(message);
    }
}