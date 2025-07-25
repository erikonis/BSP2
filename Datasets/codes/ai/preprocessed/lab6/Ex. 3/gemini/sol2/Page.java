import java.util.ArrayList;
import java.util.List;

public class Page implements Profile {
    private int id;
    private String name;
    private List<String> posts;
    private int likes;

    public Page(int id, String name) {
        this.id = id;
        this.name = name;
        this.posts = new ArrayList<>();
        this.likes = 0;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addPost(String post) {
        posts.add(post);
    }

    public void addLike() {
        likes++;
    }

    @Override
    public void showTimeline(Profile viewer) {
        System.out.println(name + "'s Timeline:");
        if (posts.isEmpty()) {
            System.out.println("No posts yet.");
        } else {
            for (String post : posts) {
                System.out.println("- " + post);
            }
        }
        System.out.println("Likes: " + likes);
    }
}