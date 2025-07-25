import java.util.*;

public abstract class Profile {
    private final String id;
    private final String name;
    private final List<String> posts;
    
    public Profile(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.posts = new ArrayList<>();
    }
    
    public void post(String content) {
        posts.add(content);
    }
    
    public abstract boolean canView(Profile requester);
    
    public void showPosts(Profile viewer) {
        if (!canView(viewer)) {
            System.out.println(name + "'s posts are private");
            return;
        }
        System.out.println(name + "'s posts:");
        posts.forEach(System.out::println);
    }
    
    public String getName() { return name; }
}