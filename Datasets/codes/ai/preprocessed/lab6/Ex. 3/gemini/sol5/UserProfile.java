import java.util.HashSet;
import java.util.Set;

public class UserProfile extends Profile {
    private Set<UserProfile> friends;

    public UserProfile(String id, String name) {
        super(id, name);
        this.friends = new HashSet<>();
    }

    public Set<UserProfile> getFriends() {
        return friends;
    }

    public void addFriend(UserProfile friend) {
        this.friends.add(friend);
        friend.getFriends().add(this); // Friendship is mutual
    }

    @Override
    public void showTimeline(Profile viewer) {
        if (viewer instanceof UserProfile) {
            UserProfile userViewer = (UserProfile) viewer;
            if (this.equals(userViewer) || friends.contains(userViewer)) {
                System.out.println("--- " + getName() + "'s Timeline ---");
                for (Post post : getPosts()) {
                    System.out.println(post);
                }
            } else {
                System.out.println("Sorry, you are not friends with " + getName() + " to view their timeline.");
            }
        } else {
            System.out.println("Pages cannot view user timelines.");
        }
    }
}