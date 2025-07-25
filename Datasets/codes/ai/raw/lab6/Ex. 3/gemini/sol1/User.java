package exercise3;

import java.util.HashSet;
import java.util.Set;

public class User extends Profile {
    private Set<User> friends;

    public User(int id, String name) {
        super(id, name);
        this.friends = new HashSet<>();
    }

    public void addFriend(User friend) {
        friends.add(friend);
    }

    @Override
    public void showTimeline(Profile viewer) {
        if (viewer == this || viewer instanceof User && friends.contains(viewer)) {
            displayPosts(viewer);
        } else {
            System.out.println(getName() + "'s timeline is private.");
        }
    }
}