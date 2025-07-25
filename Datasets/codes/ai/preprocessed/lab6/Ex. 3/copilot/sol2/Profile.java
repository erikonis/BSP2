import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Profile {
    private UUID id;
    private String name;
    private List<Post> posts;

    public Profile(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.posts = new ArrayList<>();
    }

    public UUID getId() {
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

    public abstract void showTimeline(Profile observer);
}