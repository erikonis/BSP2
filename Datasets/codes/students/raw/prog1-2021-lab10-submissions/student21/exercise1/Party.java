package lu.uni.programming1.lab10.exercise1;

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
    public void add(Character character, int index) {
        int occ = 0;
        for (Character chara : characters) {
            if (chara.getRole() == character.getRole()) {
                occ += 1;
            }
        }
        if (characters.size() < 4 && character.getRole() == CharacterRole.DAMAGE && occ < 2 && !characters.contains(character)) {
            characters.add(character);
            System.out.printf("Added %s to party %d.",character,index);
        } else if (characters.size() < 4 && occ < 1) {
            characters.add(character);
            System.out.printf("Added %s to party %d.",character,index);
        } else if (characters.size() >= 4){
            System.out.println("The party is full: no other characters can be added to it.");
        } else if (characters.contains(character)) {
            System.out.printf("Can't add %s to party, they're already in it.",character);
        } else {
            System.out.printf("Can't add %s to party: the party has reached the limit for the role %s.", character,character.getRole());
        }

    }
}
