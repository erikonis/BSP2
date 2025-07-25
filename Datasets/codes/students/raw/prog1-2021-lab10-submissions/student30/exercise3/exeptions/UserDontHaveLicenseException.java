package lu.uni.programming1.lab10.exercise3.exeptions;

import lu.uni.programming1.lab10.exercise3.Game;
import lu.uni.programming1.lab10.exercise3.User;

public class UserDontHaveLicenseException extends Exception {
    private Game game;
    private User user;

    public UserDontHaveLicenseException(Game game, User user) {
        this.setGame(game);
        this.setUser(user);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
