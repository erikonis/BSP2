package lu.uni.programming1.lab10.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<Character> characters;
    private int healer = 0;
    private int tank = 0;
    private int damage = 0;
    private int max = 4;

    Party() {
        characters = new ArrayList<>();
    }

    @Override
    public String toString() {
        String characterList = "";
        //for (Character character : characters) {
        //    characterList += "- " + character + "\n";
        //}
        //return "\nParty (" + characters.size() + " members):\n" + characterList;
        for(int i=0;i<characters.size();i++)
        {
            characterList=characterList+characters.get(i).getName()+" ";
        }
        return characterList;
    }

    // Implement the body of this method (you can also modify the method's
    // signature...)
    public void add(Character character) {

        

            if (character.getRole().equals(CharacterRole.HEALER) && healer < 1 && max!=0) {
                characters.add(character);
                System.out.println(character.getName()+" has been added to your party.");
                max=max-1;
            }
            if (character.getRole().equals(CharacterRole.TANK) && tank < 1&& max!=0) {
                characters.add(character);
                System.out.println(character.getName()+" has been added to your party.");
                max=max-1;
            }
            if (character.getRole().equals(CharacterRole.DAMAGE) && damage < 2&& max!=0) {
                characters.add(character);
                System.out.println(character.getName()+" has been added to your party.");
                max=max-1;
            }

            

        }

    
}
