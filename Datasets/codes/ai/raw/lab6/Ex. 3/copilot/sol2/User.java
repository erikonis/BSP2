package exercise3;

import java.util.HashSet;
import java.util.Set;

public class User extends Profile {
    private Set<User> friends;

    public User(String name) {
        super(name);
        this.friends = new HashSet<>();
    }

    public Set<User> getFriends() {
        return friends;
    }

    public void addFriend(User friend) {
        friends.add(friend);
    }

    @Override
    public void showTimeline(Profile observer) {
        if (observer instanceof User && friends.contains(observer)) {
            System.out.println("Timeline of " + getName() + ":");
            for (Post post : getPosts()) {
                System.out.println(post);
            }
        } else {
            System.out.println("Access denied to the timeline of " + getName());
        }
    }
}