import java.util.ArrayList;
import java.util.List;

public abstract class Profile {
    protected String id;
    protected String name;
    protected List<String> posts;

    public Profile(String id, String name) {
        this.id = id;
        this.name = name;
        this.posts = new ArrayList<>();
    }

    public void addPost(String post) {
        posts.add(post);
    }

    public abstract void showTimeline(Profile observer);
}