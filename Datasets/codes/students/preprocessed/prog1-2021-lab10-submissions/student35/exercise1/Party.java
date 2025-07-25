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

    public void add(Character character) throws Exception, NameEqualityException {

        if (characters.size() >= 4) {
            throw new Exception();
        }
        int countD = 0, countH = 0, countT = 0;
        for (int i = 0; i < characters.size(); i++) {
            switch (characters.get(i).getRole()) {
                case DAMAGE:
                    countD++;
                    break;
                case HEALER:
                    countH++;
                    break;
                case TANK:
                    countT++;
                    break;
            }
        }
        if ((countD == 2) && (character.getRole() == CharacterRole.DAMAGE)) {
            throw new Exception();
        }
        if ((countH == 1) && (character.getRole() == CharacterRole.HEALER)) {
            throw new Exception();
        }
        if ((countT == 1) && (character.getRole() == CharacterRole.TANK)) {
            throw new Exception();
        }
        for (Character c : characters){
            if (character.hashCode()==c.hashCode()){
                throw new NameEqualityException();
            }
        }

        characters.add(character);

    }
}
