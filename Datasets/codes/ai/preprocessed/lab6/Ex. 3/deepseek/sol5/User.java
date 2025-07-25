import java.util.HashSet;
import java.util.Set;

public class User extends Profile {
    private final Set<User> friends;

    public User(String name) {
        super(name);
        this.friends = new HashSet<>();
    }

    public void addFriend(User friend) {
        if (friend == this) return;
        friends.add(friend);
        friend.friends.add(this);
    }

    @Override
    public boolean canViewPosts(Profile viewer) {
        return friends.contains(viewer);
    }
}