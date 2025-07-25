import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public abstract class Profile {
    private UUID id;
    private String name;
    private Set<Post> posts;

    public Profile(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.posts = new HashSet<>();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public abstract void showTimeline(Profile observer);
}