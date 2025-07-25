import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<Character> characters;

    Party() {
        characters = new ArrayList<>();
    }


    public int getPartySize() {return characters.size();}

    public boolean isThereAHealer()  {boolean healer=false;
        
        
        for (Character i : characters) {if (i.getRole()==CharacterRole.HEALER) healer=true;  }
        
        
        return healer; }
     
    public boolean isThereATank ()   {boolean tank=false;  
        
        for (Character i : characters) {if (i.getRole()==CharacterRole.TANK) tank=true;  }
        
        return tank;  }

    public boolean areThereTwoDamage() {boolean damage= false;  
        
        for (Character i : characters) {
            
            int count =0; 
            
            if (i.getRole()==CharacterRole.DAMAGE) count+=1; 
            
            if (count==2) damage=true;  
        
        
        
        }
        
        return damage; }


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
    public void add(Character character) {




        characters.add(character); 




    }






}
