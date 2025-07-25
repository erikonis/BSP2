import java.util.ArrayList;
import java.util.List;

public abstract class Profile {
    private String id;
    private String name;
    private List<Post> posts;

    public Profile(String id, String name) {
        this.id = id;
        this.name = name;
        this.posts = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public abstract void showTimeline(Profile viewer);

    @Override
    public String toString() {
        return "Profile: " + name;
    }
}