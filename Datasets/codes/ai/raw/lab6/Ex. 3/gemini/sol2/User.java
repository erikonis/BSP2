package exercise3_interface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User implements Profile {
    private int id;
    private String name;
    private List<String> posts;
    private Set<User> friends;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.posts = new ArrayList<>();
        this.friends = new HashSet<>();
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addPost(String post) {
        posts.add(post);
    }

    public void addFriend(User friend) {
        friends.add(friend);
    }

    @Override
    public void showTimeline(Profile viewer) {
        if (viewer == this || viewer instanceof User && friends.contains(viewer)) {
            System.out.println(name + "'s Timeline:");
            if (posts.isEmpty()) {
                System.out.println("No posts yet.");
            } else {
                for (String post : posts) {
                    System.out.println("- " + post);
                }
            }
        } else {
            System.out.println(name + "'s timeline is private.");
        }
    }
}