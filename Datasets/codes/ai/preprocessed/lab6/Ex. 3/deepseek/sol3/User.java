import java.util.HashSet;
import java.util.Set;

public class User extends Profile {
    private Set<User> friends;

    public User(String id, String name) {
        super(id, name, new PrivateTimelineStrategy(new HashSet<>()));
        this.friends = new HashSet<>();
    }

    public void addFriend(User friend) {
        friends.add(friend);
    }
}