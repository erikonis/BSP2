package exercise3;

import java.util.HashSet;
import java.util.Set;

public class User extends Profile {
    private Set<User> friends;

    public User(String id, String name) {
        super(id, name);
        this.friends = new HashSet<>();
    }

    public void addFriend(User friend) {
        friends.add(friend);
    }

    @Override
    public void showTimeline(Profile observer) {
        if (observer instanceof User && friends.contains(observer)) {
            System.out.println("Timeline for " + getName() + ":");
            for (Post post : getPosts()) {
                System.out.println(post);
            }
        } else {
            System.out.println("You are not friends with " + getName() + ". Cannot view timeline.");
        }
    }
}