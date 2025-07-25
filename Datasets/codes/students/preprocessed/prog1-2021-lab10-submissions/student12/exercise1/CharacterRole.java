public enum CharacterRole {
    DAMAGE("DAMAGE"), 
    HEALER("HEALER"), 
    TANK("TANK");

    private final String characterRole; 


    CharacterRole(String characterRole) {
        this.characterRole = characterRole;
    }

    public String getCharacterRole() {
        return characterRole;
    }

    public static CharacterRole getCharacterRoleFromString(String characterRole) throws RoleException {
        CharacterRole role=null;
        switch(characterRole){
            case "HEALER":
            role = CharacterRole.HEALER;
            break;
            case "TANK":
            role = CharacterRole.TANK;
            break;
            case "DAMAGE":
            role = CharacterRole.DAMAGE;
            break;
        }
        return role;
    }
}
