import java.util.*;

public class User extends Profile {
    private final Set<User> friends = new HashSet<>();

    public User(String name) {
        super(name);
    }

    public void addFriend(User friend) {
        friends.add(friend);
        friend.friends.add(this);
    }

    @Override
    public boolean canView(Profile requester) {
        return requester instanceof User && friends.contains(requester);
    }
}