package lu.uni.programming1.lab6.Exercise3;

import java.util.UUID;

public abstract class Profile {

    private static final int TIMELINE_CAPACITY = 10;

    private String id;
    private String name;
    private String[] posts;

    public Profile(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.posts = new String[TIMELINE_CAPACITY];
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void createPost(String text) {
        int i;
        for (i = 0; this.posts[i] != null; i++)
            ;

        if (i < TIMELINE_CAPACITY) {
            this.posts[i] = text;
        } else {
            System.err.println("Timeline is full!");
        }
    }

    public void showTimeline(User observer) {
        System.out.println("Timeline of " + this.name + ":");
        for (String post : this.posts) {
            if (post != null) {
                System.out.println("- " + post);
            }
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}