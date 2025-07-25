public class Post {
    private String content;
    private String timestamp; // Simple timestamp for now

    public Post(String content) {
        this.content = content;
        this.timestamp = java.time.LocalDateTime.now().toString();
    }

    public String getContent() {
        return content;
    }

    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "[" + timestamp + "] " + content;
    }
}