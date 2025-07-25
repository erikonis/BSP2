import java.util.List;

public interface TimelineStrategy {
    void showTimeline(List<Post> posts, Profile observer);
}