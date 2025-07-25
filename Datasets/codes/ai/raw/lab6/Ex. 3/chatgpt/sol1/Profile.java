package exercise3;

import java.util.ArrayList;
import java.util.List;

public abstract class Profile {
    protected String id;
    protected String name;
    protected List<Post> timeline;

    public Profile(String id, String name) {
        this.id = id;
        this.name = name;
        this.timeline = new ArrayList<>();
    }

    public void addPost(String content) {
        timeline.add(new Post(content, this));
    }

    public abstract void showTimeline(Profile observer);

    public String getId() { return id; }
    public String getName() { return name; }
}
