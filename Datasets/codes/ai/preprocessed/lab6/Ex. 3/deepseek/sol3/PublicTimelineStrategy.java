import java.util.List;

public class PublicTimelineStrategy implements TimelineStrategy {
    @Override
    public void showTimeline(List<Post> posts, Profile observer) {
        System.out.println("Timeline:");
        for (Post post : posts) {
            System.out.println(post);
        }
    }
}