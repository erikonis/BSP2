import java.util.ArrayList;
import java.util.List;

import lu.uni.programming1.lab10.exercise1.exceptions.ExistingCharacterException;
import lu.uni.programming1.lab10.exercise1.exceptions.FullPartyException;
import lu.uni.programming1.lab10.exercise1.exceptions.PartyRoleLimitException;

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
    public void add(Character character, int partyNr)
            throws PartyRoleLimitException, FullPartyException, ExistingCharacterException {
        if (character.getName() != null && character.getRole() != null) {
            if (!characters.contains(character)) {
                if (characters.size() < 4) {
                    boolean hasRole = false;
                    for (Character character2 : characters) {
                        if (character.getRole() != CharacterRole.DAMAGE) {
                            if (character2.getRole().equals(character.getRole())) {
                                hasRole = true;
                            }
                        } else {
                            int counter = 0;
                            if (character2.getRole() == CharacterRole.DAMAGE) {
                                counter++;
                            }
                            if (counter == 2) {
                                hasRole = true;
                            }
                        }
                    }
                    if (!hasRole) {
                        characters.add(character);
                        System.out.println("Added " + character.toString() + " to party " + partyNr);
                    } else {
                        System.out.println(new PartyRoleLimitException(character).getMessage());
                    }
                } else {
                    System.out.println(new FullPartyException().getMessage());
                }
            }else{
                System.out.println(new ExistingCharacterException(character).getMessage());
            }
        }
    }
}
