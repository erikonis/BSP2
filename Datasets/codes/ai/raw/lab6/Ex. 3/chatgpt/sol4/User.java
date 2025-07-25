import java.util.HashSet;
import java.util.Set;

public class User extends Profile {
    private Set<User> friends;

    public User(String id, String name) {
        super(id, name);
        this.friends = new HashSet<>();
    }

    public Set<User> getFriends() {
        return friends;
    }

    public void addFriend(User friend) {
        if (friend != null) {
            friends.add(friend);
            System.out.println(getName() + " and " + friend.getName() + " are now friends!");
        }
    }

    @Override
    public void showTimeline(Profile viewer) {
        if (viewer instanceof User && friends.contains(viewer)) {
            System.out.println("Showing timeline to friend: " + viewer.getName());
            for (Post post : getPosts()) {
                System.out.println(post);
            }
        } else if (viewer instanceof Page) {
            // Regular users can't see each other's timelines unless they're friends
            System.out.println("Only friends can view each other's timelines.");
        }
    }
}
