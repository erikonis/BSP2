import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class Post {
    private String content;
    private String timestamp;

    public Post(String content) {
        this.content = content;
        this.timestamp = LocalDateTime.now().toString();
    }

    public String getContent() {
        return content;
    }

    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "[" + timestamp + "] " + content;
    }
}

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

    public void addPost(String content) {
        this.posts.add(new Post(content));
    }

    public abstract void showTimeline(Profile viewer);
}