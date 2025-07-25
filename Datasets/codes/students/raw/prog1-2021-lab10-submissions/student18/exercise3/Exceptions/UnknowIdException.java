package lu.uni.programming1.lab10.exercise3.Exceptions;

public class UnknowIdException extends Exception {
    
    private String game_name;
    private String user_name;

    public UnknowIdException(String username, String game_name) {
        this.game_name = game_name;
        this.user_name = username;
    }

    public String getGame_name() {
        return game_name;
    }
    public String getUser_name() {
        return user_name;
    }

}
