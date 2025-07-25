public interface PrivacySetting {
    boolean canView(Profile viewer, Profile owner);
}