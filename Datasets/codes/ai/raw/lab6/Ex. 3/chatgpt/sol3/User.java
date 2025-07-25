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
        if (friend == this) {
            System.out.println("You cannot be friends with yourself!");
            return;
        }
        friends.add(friend);
        friend.friends.add(this);
        System.out.println(name + " and " + friend.getName() + " are now friends!");
    }

    public boolean isFriendsWith(User user) {
        return friends.contains(user);
    }

    @Override
    public void showTimeline(Profile viewer) {
        System.out.println("\n🔹 " + name + "'s Timeline:");
        for (Post post : timeline) {
            if (post.canView(viewer)) {
                System.out.println(post);
            } else {
                System.out.println("[Private Post]");
            }
        }
    }
}
