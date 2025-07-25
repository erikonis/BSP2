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
