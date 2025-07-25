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

    // Implement the body of this method (you can also modify the method's
    // signature...)


    public void Add(Character character) throws FullPartyException, DuplicateException, PartyCompositionException {


        if (characters.size()==4) {
            throw new FullPartyException();
        }
        if (characters.contains(character)) {
            throw new DuplicateException();
        }

        int temp = 0;

        for (int i = 0 ; i < characters.size() ; i++) {
            if (characters.get(i).getRole()==character.getRole()) {
                temp++;
            }
        }

        switch (character.getRole()) {
            case DAMAGE : if (temp>=2) {
                throw new PartyCompositionException();
            }
            else {characters.add(characters.size(),character);}
            break;
            case HEALER : if (temp>=1) {
                throw new PartyCompositionException();
            }
            else {characters.add(characters.size(),character);}
            break;
            case TANK : if (temp>=1) {
                throw new PartyCompositionException();
            }
            else {characters.add(characters.size(),character);}
            break; 
        }

        temp = 0;

        System.out.println("Added " + character.getName() + " (" + character.getRole() + ")" + " to party " + character.getParty());

    }

}

