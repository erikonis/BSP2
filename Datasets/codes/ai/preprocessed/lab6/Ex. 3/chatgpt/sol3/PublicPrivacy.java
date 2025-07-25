public class PublicPrivacy implements PrivacySetting {
    @Override
    public boolean canView(Profile viewer, Profile owner) {
        return true; // Everyone can see this post
    }
}