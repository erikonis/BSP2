import java.util.HashSet;
import java.util.Set;

public class User extends Profile {
    private final Set<User> friends;

    public User(String name) {
        super(name);
        this.friends = new HashSet<>();
    }

    public void addFriend(User friend) {
        if (friend == this) {
            throw new IllegalArgumentException("Cannot add yourself as a friend");
        }
        friends.add(friend);
        friend.friends.add(this); // Mutual friendship
    }

    public boolean isFriendWith(User user) {
        return friends.contains(user);
    }

    @Override
    public boolean canViewTimeline(Profile viewer) {
        // Only friends can view a user's timeline
        return viewer instanceof User && isFriendWith((User) viewer);
    }

    @Override
    public String toString() {
        return "User: " + super.toString();
    }
}