import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Profile {
    private final String id;
    private final String name;
    private final List<Post> posts;

    public Profile(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.posts = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void createPost(String content) {
        posts.add(new Post(this, content));
    }

    public abstract boolean canViewTimeline(Profile viewer);

    public void showTimeline(Profile viewer) {
        if (!canViewTimeline(viewer)) {
            System.out.println("You don't have permission to view this timeline.");
            return;
        }

        System.out.println("\n=== Timeline for " + name + " ===");
        if (posts.isEmpty()) {
            System.out.println("No posts available.");
        } else {
            for (Post post : posts) {
                System.out.println(post);
            }
        }
    }

    @Override
    public String toString() {
        return name + " (" + id + ")";
    }
}