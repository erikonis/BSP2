import java.util.HashSet;
import java.util.Set;

public class RestrictedPrivacy implements PrivacySetting {
    private Set<User> allowedUsers = new HashSet<>();

    public void allowUser(User user) {
        allowedUsers.add(user);
    }

    @Override
    public boolean canView(Profile viewer, Profile owner) {
        return allowedUsers.contains(viewer);
    }
}