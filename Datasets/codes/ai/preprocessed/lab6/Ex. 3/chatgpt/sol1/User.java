import java.util.HashSet;
import java.util.Set;

public class User extends Profile {
    private Set<User> friends;

    public User(String id, String name) {
        super(id, name);
        this.friends = new HashSet<>();
    }

    public void addFriend(User friend) {
        if (friend == this) {
            System.out.println("You cannot be friends with yourself!");
            return;
        }
        friends.add(friend);
        friend.friends.add(this);
        System.out.println(name + " and " + friend.getName() + " are now friends!");
    }

    @Override
    public void showTimeline(Profile observer) {
        if (observer instanceof User && friends.contains(observer)) {
            System.out.println(name + "'s Timeline (Visible to Friends):");
            for (Post post : timeline) {
                System.out.println(post);
            }
        } else {
            System.out.println("Access Denied! " + name + "'s timeline is private.");
        }
    }
}