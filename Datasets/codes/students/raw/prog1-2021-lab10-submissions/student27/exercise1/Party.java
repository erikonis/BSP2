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
        return "\nParty (" + characters.size() + " members):\n" + characterList ;
    }

    // Implement the body of this method (you can also modify the method's
    // signature...)
    public void add(Character character) throws PartyFullException, DuplicateException, ContainsRoleException{
        if(characters.size()==4){
            throw new PartyFullException();
        }
        int DAMAGE = 0;
        int HEALER = 0;
        int TANK  = 0; 
        for (int i = 0; i < characters.size(); i++) {
            if(character.equals(characters.get(i))){
                throw new DuplicateException();
            }
            if(characters.get(i).getRole().equals(CharacterRole.DAMAGE))
            {
                DAMAGE++;
            } else{
                if(characters.get(i).getRole().equals(CharacterRole.HEALER)){
                    HEALER++;
                } else{
                    if(characters.get(i).getRole().equals(CharacterRole.TANK)){
                        TANK++;
                    }
                }
            } 
        }
        CharacterRole c = character.getRole();
        if(c.equals(CharacterRole.DAMAGE)){
            if(DAMAGE == 2){
                throw new ContainsRoleException();
            }
            else{
                characters.add(character);
            }
        }
        if(c.equals(CharacterRole.HEALER)){
            if(HEALER == 1){
                throw new ContainsRoleException();
            }
            else{
                characters.add(character);
            }
        }
        if(c.equals(CharacterRole.TANK)){
            if(TANK == 1){
                throw new ContainsRoleException();
            }
            else{
                characters.add(character);
            }
        }
    }
        
}
