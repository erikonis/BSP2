package exercise3;

import java.util.List;

public class PrivateTimelineStrategy implements TimelineStrategy {
    private Set<User> friends;

    public PrivateTimelineStrategy(Set<User> friends) {
        this.friends = friends;
    }

    @Override
    public void showTimeline(List<Post> posts, Profile observer) {
        if (observer instanceof User && friends.contains(observer)) {
            System.out.println("Timeline:");
            for (Post post : posts) {
                System.out.println(post);
            }
        } else {
            System.out.println("You are not friends. Cannot view timeline.");
        }
    }
}