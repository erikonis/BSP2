import java.util.ArrayList;
import java.util.List;

public abstract class Profile {
    private String id;
    private String name;
    private List<Post> posts;
    private TimelineStrategy timelineStrategy;

    public Profile(String id, String name, TimelineStrategy timelineStrategy) {
        this.id = id;
        this.name = name;
        this.posts = new ArrayList<>();
        this.timelineStrategy = timelineStrategy;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public void showTimeline(Profile observer) {
        timelineStrategy.showTimeline(posts, observer);
    }
}