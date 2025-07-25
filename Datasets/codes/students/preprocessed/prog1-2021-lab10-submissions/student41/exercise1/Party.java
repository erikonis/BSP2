import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<Character> characters;
    private static int nr = 0;
    private int nrc;

    Party() {
        nrc = nr++;
        characters = new ArrayList<>();
    }

    public int getNrc() {
        return nrc;
    }

    @Override
    public String toString() {
        String characterList = "";
        for (Character character : characters) {
            characterList += "- " + character + "\n";
        }
        return "\nParty (" + characters.size() + " members):\n" + characterList;
    }

    public void add(Character c) throws TooManyChar, TooManySpecificChar, AlreadyInParty {
        if (characters.size() == 4)
            throw new TooManyChar();
        else if (characters.contains(c))
            throw new AlreadyInParty();
        else
            switch (c.getRole()) {
                case HEALER:
                    for (Character character : characters)
                        if (character.getRole() == CharacterRole.HEALER)
                            throw new TooManySpecificChar(CharacterRole.HEALER);
                    characters.add(c);
                    break;
                case TANK:
                    for (Character character : characters)
                        if (character.getRole() == CharacterRole.TANK)
                            throw new TooManySpecificChar(CharacterRole.TANK);
                    characters.add(c);
                    break;
                case DAMAGE:
                    int dmg = 0;
                    for (Character character : characters)
                        if (character.getRole() == CharacterRole.DAMAGE)
                            dmg++;
                    if (dmg == 2)
                        throw new TooManySpecificChar(CharacterRole.DAMAGE);
                    characters.add(c);
                    break;
            }
    }
}
