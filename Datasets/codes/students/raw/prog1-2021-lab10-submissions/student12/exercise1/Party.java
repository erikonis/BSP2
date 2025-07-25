package lu.uni.programming1.lab10.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<Character> characters;
    private int characterCount=0;
    private int healerCount=0;
    private int tankCount=0;
    private int damageCount=0;

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
    public void add(Character character) throws InvalidRoleForTheGivenPartyException, CharacterAlreadyInThePartyException, FullPartyException {

        CharacterRole role = character.getRole();
        
        if(characterCount<4){
            
            for (Character characterInTheParty : characters) {
                if(characterInTheParty.equals(character)){
                    throw new CharacterAlreadyInThePartyException("Can't add "+character.getName()+" ("+character.getRole()+") to party, they're already in it.");
                }
            }
            switch(role){
                case HEALER:
                    if(healerCount==0){
                        characters.add(character);
                        healerCount++;
                        characterCount++;
                    }else{
                        throw new InvalidRoleForTheGivenPartyException("Can't add "+character.getName()+" (HEALER) to party: the party has reached the limit for the role HEALER");
                    }break;

                case TANK:
                    if(tankCount==0){
                        characters.add(character);
                        tankCount++;
                        characterCount++;
                    }else{
                        throw new InvalidRoleForTheGivenPartyException("Can't add "+character.getName()+" (TANK) to party: the party has reached the limit for the role TANK");
                    }
                    break;
                case DAMAGE:
                if(damageCount<2){
                    characters.add(character);
                    damageCount++;
                    characterCount++;
                }else{
                    throw new InvalidRoleForTheGivenPartyException("Can't add "+character.getName()+" (DAMAGE) to party: the party has reached the limit for the role DAMAGE");
                }
                break;
            }
        }else{
            throw new FullPartyException("The party is full: no other characters can be added to it.");
        }
    }
}
