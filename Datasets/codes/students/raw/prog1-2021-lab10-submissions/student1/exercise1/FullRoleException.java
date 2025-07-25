package lu.uni.programming1.lab10.exercise1;

public class FullRoleException extends Throwable {
    private Character character;

    public FullRoleException(Character character){
        this.character = character;
    }
    @Override
    public String toString(){
        return "Can't add " + character + " to party: the party has reached the limit for the role " + character.getRole();
    }
}
