import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<Character> characters;
    private int healerCount;
    private int tankCount;
    private int damageCount;

    public Party() {
        characters = new ArrayList<>();
        healerCount = 0;
        tankCount = 0;
        damageCount = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nParty (" + characters.size() + " members):\n");
        for (Character character : characters) {
            sb.append("- ").append(character).append("\n");
        }
        return sb.toString();
    }

    public void add(Character character) throws PartyException {
        if (characters.size() >= 4) {
            throw new PartyException("Party is full (maximum 4 members allowed)");
        }

        if (characters.contains(character)) {
            throw new PartyException("Character " + character.getName() + " is already in this party");
        }

        switch (character.getRole()) {
            case HEALER:
                if (healerCount >= 1) {
                    throw new PartyException("Party can only have 1 Healer");
                }
                healerCount++;
                break;
            case TANK:
                if (tankCount >= 1) {
                    throw new PartyException("Party can only have 1 Tank");
                }
                tankCount++;
                break;
            case DAMAGE:
                if (damageCount >= 2) {
                    throw new PartyException("Party can only have 2 Damage dealers");
                }
                damageCount++;
                break;
        }

        characters.add(character);
    }

    public boolean remove(Character character) {
        if (characters.remove(character)) {
            switch (character.getRole()) {
                case HEALER: healerCount--; break;
                case TANK: tankCount--; break;
                case DAMAGE: damageCount--; break;
            }
            return true;
        }
        return false;
    }

    public List<Character> getCharacters() {
        return new ArrayList<>(characters);
    }
}