package lu.uni.programming1.lab10.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<Character> characters;
    private int nDamage;
    private int nTank;
    private int nHealer;

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


    public void add(Character character) throws FullRoleException{

        if (character.getRole().equals(CharacterRole.DAMAGE) && nDamage > 1) //2 DAMAGES
            throw new FullRoleException(character);
        else if(character.getRole().equals(CharacterRole.HEALER) && nHealer > 0) //1 HEALER
            throw new FullRoleException(character);
        else if(character.getRole().equals(CharacterRole.TANK) && nTank > 0) //1 TANK
            throw new FullRoleException(character);
        
        if(character.getRole().equals(CharacterRole.DAMAGE))
             nDamage++;
        else if(character.getRole().equals(CharacterRole.HEALER))
            nHealer++;
        else if(character.getRole().equals(CharacterRole.TANK))
            nTank++;

        System.out.println("Damage: " + nDamage);
        System.out.println("Healer: "+nHealer);
        System.out.println("Tank: "+nTank);

        characters.add(character);
    }
}
    
