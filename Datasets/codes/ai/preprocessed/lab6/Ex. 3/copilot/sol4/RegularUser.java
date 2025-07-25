import java.util.HashSet;
import java.util.Set;

public class RegularUser extends Profile {
    private Set<RegularUser> friends;

    public RegularUser(String id, String name) {
        super(id, name);
        this.friends = new HashSet<>();
    }

    public void addFriend(RegularUser friend) {
        friends.add(friend);
    }

    @Override
    public void showTimeline(Profile observer) {
        if (observer instanceof RegularUser && friends.contains(observer)) {
            System.out.println("Timeline of " + name + ": " + posts);
        } else {
            System.out.println("Access denied to timeline of " + name);
        }
    }
}