package lu.uni.programming1.lab10.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<Character> characters;
    private int partynum;

    Party(int partynum) {
        this.partynum = partynum;
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
    public void checkPartyComp(Character character) throws PartyCompException{
        int ddcount = 0;
        for (Character charIndex : characters) {
            if (character.getRole() == CharacterRole.TANK && charIndex.getRole() == CharacterRole.TANK){
                throw new PartyCompException("Can't add " + character + " to party: the party has reached the limit for the role TANK");
            }
            else if (character.getRole() == CharacterRole.HEALER &&charIndex.getRole() == CharacterRole.HEALER){
                throw new PartyCompException("Can't add " + character + " to party: the party has reached the limit for the role HEALER");
            }
            else if (character.getRole() == CharacterRole.DAMAGE &&charIndex.getRole() == CharacterRole.DAMAGE){
                ddcount++;
                if (ddcount >= 2){
                    throw new PartyCompException("Can't add " + character + " to party: the party has reached the limit for the role DAMAGE");
                }
                
            }
        }
    }

    public void checkDuplicates(Character character) throws DuplicateCharException{
        for (Character charIndex : characters){
            if (character.equals(charIndex)){
                throw new DuplicateCharException("Can't add "+ character+ " to party, they're already in it.");
            }
        }
    }

    public void checkFullParty() throws FullPartyException {
        if (characters.size() >= 4){
            throw new FullPartyException("The party is full: no other characters can be added to it.");
        } 
    }

    public void add(Character character) throws FullPartyException, PartyCompException, DuplicateCharException{
   
        try {
        checkFullParty();
        checkPartyComp(character);
        checkDuplicates(character);
        characters.add(character); 
        System.out.println("Character " + character + " added to Party " + partynum);
        }  
        catch (PartyCompException | DuplicateCharException | FullPartyException ex){
            System.err.println(ex);
        }
        
    
    
      
    
}

}
