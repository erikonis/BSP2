package lu.uni.programming1.lab10.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Party {
    private List<Character> characters;
    private String name;
    private CharacterRole role;


    Scanner scanner = new Scanner(System.in);

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


    public void add(Character character) {

     characters.add(character);
        
      

    }

    

    public void displayParty(){

        System.out.println(characters);
    }

        
    

 
    public String Charactername(){

        String name = scanner.nextLine();

        return name;

        
    }

    public String getRolename(){

        String rolename = scanner.nextLine();

        return rolename;
    }
}
