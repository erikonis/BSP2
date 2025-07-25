import java.util.ArrayList;
import java.util.List;

public class Party {
    private final List<Character> characters;

    public Party() {
        characters = new ArrayList<>();
    }

    public void add(Character character) throws Exception {
        if (characters.contains(character)) {
            throw new Exception("Character is already in the party.");
        }
        if (characters.size() >= 4) {
            throw new Exception("Party is full.");
        }

        long roleCount = characters.stream()
                .filter(c -> c.getRole() == character.getRole())
                .count();

        switch (character.getRole()) {
            case HEALER:
            case TANK:
                if (roleCount >= 1) throw new Exception("Role " + character.getRole() + " already in party.");
                break;
            case DAMAGE:
                if (roleCount >= 2) throw new Exception("Too many DAMAGE characters.");
                break;
        }

        characters.add(character);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Party (" + characters.size() + " members):\n");
        for (Character c : characters) {
            sb.append("- ").append(c).append("\n");
        }
        return sb.toString();
    }
}
