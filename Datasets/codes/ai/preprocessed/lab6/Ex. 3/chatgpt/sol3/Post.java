import java.time.LocalDateTime;

public class Post {
    private String content;
    private LocalDateTime timestamp;
    private Profile author;
    private PrivacySetting privacySetting;

    public Post(String content, Profile author, PrivacySetting privacySetting) {
        this.content = content;
        this.timestamp = LocalDateTime.now();
        this.author = author;
        this.privacySetting = privacySetting;
    }

    public boolean canView(Profile viewer) {
        return privacySetting.canView(viewer, author);
    }

    @Override
    public String toString() {
        return "[" + timestamp + "] " + author.getName() + ": " + content;
    }
}