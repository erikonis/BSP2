import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<Character> characters;

    public Party() {
        characters = new ArrayList<>();
    }

    public void add(Character character) throws
            DuplicateCharacterException,
            PartyFullException,
            RoleLimitExceededException {

        if (characters.contains(character)) {
            throw new DuplicateCharacterException("Character is already in the party.");
        }

        if (characters.size() >= 4) {
            throw new PartyFullException("Party is full. Cannot add more characters.");
        }

        long count = characters.stream()
                .filter(c -> c.getRole() == character.getRole())
                .count();

        switch (character.getRole()) {
            case HEALER:
            case TANK:
                if (count >= 1) {
                    throw new RoleLimitExceededException("Party already has a " + character.getRole() + ".");
                }
                break;
            case DAMAGE:
                if (count >= 2) {
                    throw new RoleLimitExceededException("Party already has 2 DAMAGE characters.");
                }
                break;
        }

        characters.add(character);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Party (" + characters.size() + " members):\n");
        for (Character character : characters) {
            sb.append("- ").append(character).append("\n");
        }
        return sb.toString();
    }
}