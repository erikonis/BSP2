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
    public boolean add(Character character) {
        boolean added = false;
        
         if(characters.size()>=4)
            System.out.println("The party is full: no other characters can be added to it.");
        else{
            boolean alreadyIn=false;
            int damCap=2;
            int healCap=1;
            int tankCap=1;
            
            for (Character c : characters) {
                if(c.getRole() == CharacterRole.DAMAGE)
                    damCap--;
                if(c.getRole() == CharacterRole.HEALER)
                    healCap--;
                if(c.getRole() == CharacterRole.TANK)
                    tankCap--;
                if(c.equals(character))
                    alreadyIn=true;
            }
            if(alreadyIn)
                System.out.println("Can't add "+character.toString()+" to party, they're already in it.");
            else if(damCap<=0 && character.getRole()==CharacterRole.DAMAGE)
                System.out.println("Can't add "+character.toString()+" to party: the party has reached the limit for the role "+character.getRole());
            else if(healCap<=0 && character.getRole()==CharacterRole.HEALER)
                System.out.println("Can't add "+character.toString()+" to party: the party has reached the limit for the role "+character.getRole());
            else if(tankCap<=0 && character.getRole()==CharacterRole.TANK)
                System.out.println("Can't add "+character.toString()+" to party: the party has reached the limit for the role "+character.getRole());
            else{
                characters.add(characters.size(), character);
                added=true;
                }
                /* System.out.println("DamageCap "+damCap+" HealCap "+healCap+" TankCap "+tankCap+" AlreadyIn "+alreadyIn); */
            }
        System.out.println("");
        return added;
    }
}
