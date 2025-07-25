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

    public void addPost(String content, PrivacySetting privacy) {
        timeline.add(new Post(content, this, privacy));
    }

    public abstract void showTimeline(Profile viewer);

    public String getId() { return id; }
    public String getName() { return name; }
}