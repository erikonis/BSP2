package lu.uni.programming1.lab10.exercise1;
import java.util.Scanner;

import javax.naming.InvalidNameException;

public class Character {
    private String name;
    private CharacterRole role;

    // You may edit this constructor if you so wish
    public Character(String name, CharacterRole role) {
        this.name = name;
        this.role = role;
    }

    public void addmember(Character A){
        Scanner scanner = new Scanner(System.in);
        //int readNumber;
        //int counter = 0;
        //int i =0;
        //Character[] group = new Character[1000];
        String name_ = null;
        CharacterRole role_ = null;

        try{
            System.out.println("Enter the name of the Character (NO NULL and NO MORE THAN 20 CHARACTERS allowed)");
            name_ = scanner.next();
            if(name_.chars().count()>21){
                throw new toolongException();
            }
            if(name_ =="" ){
                throw new nullString();
            }
            System.out.println("Enter the  role of the Character (DAMAGE, HEALER or TANK) ");
            String roleString = scanner.next();
                        
            switch (roleString){
                case "DAMAGE", "damage":
                    role_ = CharacterRole.DAMAGE;
                    break;
                case "HEALER", "healer":
                    role_ = CharacterRole.DAMAGE;
                    break;
                case "TANK", "tank":
                    role_ = CharacterRole.TANK; 
                    break;
                default:
                    throw new UnknowRole();
            }
        } catch (nullString e){
        System.err.println("NULL names are not allowed");
        } catch (toolongException e){
        System.err.println("NO more than 20 characters allowed");  
        } catch (UnknowRole e){
        System.err.println("ROLE not found");
        }
        finally{
            if(name_!=null && role_ != null){
            A.setName(name_);
            A.setRole(role_);
            }
        }

}


    public String getName() {
        return name;
    }

    public CharacterRole getRole() {
        return role;
    }


    
    public void setName(String name) {
        this.name = name;
    }

    public void setRole(CharacterRole role) {
        this.role = role;
    }

   
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Character other = (Character) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return name + " (" + role + ")";
    }
}
