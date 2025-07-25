import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Profile {
    private final String id;
    private final String name;
    private final List<String> posts;
    
    public Profile(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.posts = new ArrayList<>();
    }
    
    public void addPost(String content) {
        posts.add(content);
    }
    
    public abstract boolean canViewPosts(Profile viewer);
    
    public void displayPosts(Profile viewer) {
        if (!canViewPosts(viewer)) {
            System.out.println("Cannot view " + name + "'s posts");
            return;
        }
        
        System.out.println("\n" + name + "'s Posts:");
        posts.forEach(post -> System.out.println("- " + post));
    }
    
    public String getName() {
        return name;
    }
}