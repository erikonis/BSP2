package lu.uni.programming1.lab10.exercise1;

import java.util.Scanner;

public class Launcher {

    static Scanner scanner = new Scanner(System.in);
    static int command;
    static String name;
    static String role;
    static int showParty;
    static int addToParty;
    static boolean next = true;

    static Party zero = new Party();
    static Party one = new Party();

    public static void main(String[] args) {
        MainCommands();
    }

    private static void MainCommands(){
        String text = "Commands:" + 
        "\n 0 - Exit" +
        "\n 1 - Create new character" +
        "\n 2 - Show party";

        System.out.println(text);
        try{
            command = scanner.nextInt();

            if(command<0 || command>2)
            throw new InvalidCommandException();

            switch(command){
                case 0:
                    System.out.println("Exiting!");
                    break;
                case 1:
                    createCharacterCommands();
                    break;
                case 2:
                    showPartyCommands();
                    break;
            }
        }catch(InvalidCommandException e){
            System.out.println("Invalid command index!");
            MainCommands();
        }catch(Exception e){
            System.err.println("Please enter a number (0, 1 or 2)!");
            MainCommands();
        }
    }

    private static void createCharacterCommands(){
        next = true;
        System.out.println("Creating new character...");
        enterName();
    }

    private static void enterName(){
        System.out.println("Enter name:");
        try{
            name = scanner.next();

            if(name.isEmpty())
            throw new InvalidCharacterName();

            if(name.length()>20)
            throw new InvalidCharacterName();
        }catch(InvalidCharacterName e){
            System.err.println("Name empty or too long (max. 20 characters!)!");
            next = false;
            MainCommands();
        }catch(Exception e){
            System.err.println("Type mismatch, enter the letters for the name!");
            next = false;
            MainCommands();
        }finally{
            if(next)
            enterRole();
        }
    }

    private static void enterRole(){
        System.out.println("Enter role:");
        try{
            role = scanner.next();

            if(!hasRole(role))
            throw new UnknownRoleException();
        }catch(UnknownRoleException e){
            System.err.println("That role is not an option, available: DAMAGE, HEALER AND TANK.");
            next = false;
            MainCommands();
        }catch(Exception e){
            System.err.println("Type mismatch, enter the letters for the role!");
            next = false;
            MainCommands();
        }finally{
            if(next)
            chooseParty();
        }
    }

    private static void chooseParty(){
        System.out.println("Add to party (0, 1)!");
        try{
            addToParty = scanner.nextInt();

            if(addToParty<0 || addToParty>1)
            throw new InvalidCommandException();
        }catch(InvalidCommandException e){
            System.err.println("Index "+addToParty+" out of bounds for length 2!");
            next = false;
            MainCommands();
        }catch(Exception e){
            System.err.println("Type mismatch! Please enter a number (0 or 1)!");
            next = false;
            MainCommands();
        }finally{
            if(next)
            adding();
        }
    }

    private static void adding(){
        Character character = new Character(name, CharacterRole.valueOf(CharacterRole.class, role));
        try{
            switch(addToParty){
                case 0:
                    zero.add(character);
                    break;
                case 1:
                    one.add(character);
                    break;    
            }
        }catch(PartyFullException e){
            System.err.println("Party is full, can not add more members!");
            next = false;
            MainCommands();
        }catch(ExistingCharacterException e){
            System.err.println("This character already exists, please add a different one!");
            next = false;
            MainCommands();
        }catch(RoleLimitException e){
            System.err.println("Can not add more characters of that type of role!");
            next = false;
            MainCommands();
        }finally{
            if(next){
                System.out.println("Added "+character+" to party "+addToParty+".");
                MainCommands();
            }
        }
    }

    private static void showPartyCommands(){
        next = true;
        System.out.println("Show party (0 or 1):");
        try{
            showParty = scanner.nextInt();

            switch(showParty){
                case 0:
                    System.out.println(zero.toString());
                    break;
                case 1:
                    System.out.println(one.toString());
                    break;      
                default:
                throw new InvalidCommandException();    
            }
        }catch(InvalidCommandException e){
            System.err.println("Index "+showParty+" out of bounds for length 2!");
            next = false;
            MainCommands();
        }catch(Exception e){
            System.err.println("Type mismatch! Please enter a number (0 or 1)!");
            next = false;
            MainCommands();
        }finally{
            if(next)
            MainCommands();
        }
    }

    public static boolean hasRole(String s){
        for(CharacterRole test : CharacterRole.values())
            if(test.name().equals(s))
                return true;
            return false;    
    }

}
