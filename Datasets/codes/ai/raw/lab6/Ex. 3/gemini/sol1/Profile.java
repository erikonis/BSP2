package exercise3;

import java.util.ArrayList;
import java.util.List;

public abstract class Profile {
    private int id;
    private String name;
    private List<String> posts;

    public Profile(int id, String name) {
        this.id = id;
        this.name = name;
        this.posts = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addPost(String post) {
        posts.add(post);
    }

    public abstract void showTimeline(Profile viewer);

    protected void displayPosts(Profile viewer) {
        System.out.println(name + "'s Timeline:");
        if (posts.isEmpty()) {
            System.out.println("No posts yet.");
        } else {
            for (String post : posts) {
                System.out.println("- " + post);
            }
        }
    }
}