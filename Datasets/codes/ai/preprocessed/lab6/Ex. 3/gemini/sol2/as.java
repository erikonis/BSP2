import java.util.ArrayList;
import java.util.List;

public abstract class Profile {
    // ... (other attributes)
    private List<Post> posts;

    public Profile(int id, String name) {
        // ...
        this.posts = new ArrayList<>();
    }

    public void addPost(String content) {
        posts.add(new Post(content, this));
    }

    // ... (showTimeline and displayPosts - updated to use Post objects)
}