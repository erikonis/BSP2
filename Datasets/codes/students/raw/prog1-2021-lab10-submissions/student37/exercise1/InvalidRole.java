package lu.uni.programming1.lab10.exercise1;

public class InvalidRole extends Exception{
    CharacterRole role;
    public InvalidRole(String role)
    {
       this.role = Party.convertCharacterStringCharacterRole(role);
    }

    public String toString()
    {
        if(role==null) return "Unknown character role.";
        else return "";
    }
}
