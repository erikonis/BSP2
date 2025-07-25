import java.util.Scanner;

public class Launcher {
    static int choice;
    static int choice2;
    static int choice3;
    static Scanner scan = new Scanner(System.in);
    static Character character = new Character(null,null);
    static Party party = new Party();
    static String name;

    public static Character getCharacter() {
        return character;
    }

    public static void main(String[] args) {
        provide();
    }
    public static int provide(){
        System.out.println("please provide a choice : \n 0 :exit\n 1 :create \n 2 :party");
        choice = scan.nextInt();
        act(choice);
        return choice;
    }

    public static void act(int choice){
        if(choice == 0)
            System.exit(2);
        if(choice == 1)
            ask();
        if(character.getName() == null)
            System.out.println("no permissions");
        else{
                System.out.println("Please input your choice : \n1 - Add someone to party \n2 - List party\n");
                choice3 = scan.nextInt();
                if(choice3 == 1)
                    party.Add();
                if(choice2 == 2)
                    party.View();
        }
        scan.close();
    }
    public static Character ask(){
        System.out.println("input the character's name :");
        name = scan.next();
        if(name.length() > 20) {
            System.out.println("word is too long !");
            provide();
        }
        else{
            System.out.println("specify the characters role : \n1 : damage \n 2 : tank \n 3 : healer ");
            choice2 = scan.nextInt();
            if (choice2 == 1) {
                character.setRole(CharacterRole.DAMAGE.name());
            } else if (choice2 == 2) {
                character.setRole(CharacterRole.TANK.name());
            } else if (choice2 == 3) {
                character.setRole(CharacterRole.HEALER.name());
            } else {
                throw new Error("unknown choice.");
            }
            try{
                character = new Character(name, character.getRole());
            }catch (Exception e){
                System.out.println(e);
            }finally {
                System.out.println("character added  !\nname : " + name + "\n" + "role : " + character.getRole());
                character.setName(name);
                provide();
            }
        }
        return character;
    }
}
