package lu.uni.programming1.lab10.exercise1;

import java.util.ArrayList;
import java.util.List;

import javax.lang.model.util.ElementScanner14;

public class Party {
    private List<Character> characters;

    Party() {
        characters = new ArrayList<>();
    }

    

    
    public List<Character> getCharacters() {
        return characters;
    }




    public void setCharacters(List<Character> characters) {
        this.characters = characters;
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
    public void add(Character character){

        try{
            if(characters.size()<4)
            {
                if(character.getName()!=null && character.getRole()!=null){
                    characters.add(character);}
                    else throw new noMoreinList();

                }
                

                /*
            for (Character i : characters){
                if(character.getRole().equals(i.getRole())){
                    throw new noThisRole();
                }
                else characters.add(character);
            }
            */
           else throw new noMoreinList();
         

        //} catch (noThisRole e){
        //System.err.println("not ROLE allowed");
        } catch (noMoreinList e){
        System.err.println("not more characters allowed or null character");
        }
        

    }
}
