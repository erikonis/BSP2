public class FriendsOnlyPrivacy implements PrivacySetting {
    @Override
    public boolean canView(Profile viewer, Profile owner) {
        if (owner instanceof User && viewer instanceof User) {
            return ((User) owner).isFriendsWith((User) viewer);
        }
        return false;
    }
}