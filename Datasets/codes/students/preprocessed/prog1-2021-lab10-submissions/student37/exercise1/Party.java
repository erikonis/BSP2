import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
    public void add(Character character) throws Exception{
        int healer = 0;
        int tank = 0;
        int damage = 0;

        for(Character x: characters)
        {
            if(character.equals(x)) throw new DuplicatedCharacter(character);
            
            switch(x.getRole())
            {
                case DAMAGE:
                    damage++;
                    break;
                case HEALER:
                    healer++;
                    break;
                case TANK:
                    tank++;
                    break;
            }
        }

        if((healer+tank+damage)==4){throw new PartyFull();}
        
        switch(character.getRole())
            {
                case DAMAGE:
                        if(damage<=2) {characters.add(character);break;}
                        else throw new RoleFull(character);
                case HEALER:
                        if(healer<=1){characters.add(character);break;}
                        else throw new RoleFull(character);
                case TANK:
                        if(tank<=1) {characters.add(character);break;}
                        else throw new RoleFull(character);
            }
    }

    static public Character createCharacter(Scanner scanner) throws Exception
    {
        System.out.println("Creating new Character...");
                        String name ="";
                        String role = null;

                        System.out.print("\nEnter name: ");         
                        name = scanner.nextLine();

                        System.out.print("\nEnter role (DAMAGE, TANK, HEALER): ");         
                        role = scanner.nextLine();

        InvalidName invalidName = new InvalidName(name);
        InvalidRole invalidRole = new InvalidRole(role);

        if(!invalidName.toString().equals("")) {throw invalidName;}
        if(!invalidRole.toString().equals("")) {throw invalidRole;}

        return new Character(name, convertCharacterStringCharacterRole(role));
    }

    static public CharacterRole convertCharacterStringCharacterRole(String role)
    {
        switch(role)
        {
            case "DAMAGE": return CharacterRole.DAMAGE;
            case "HEALER": return CharacterRole.HEALER;
            case "TANK" : return CharacterRole.TANK;
            default : return null;
        }
    }
}
