package exercise3;

import java.time.LocalDateTime;

public class Post {
    private String content;
    private LocalDateTime timestamp;
    private Profile author;

    public Post(String content, Profile author) {
        this.content = content;
        this.timestamp = LocalDateTime.now();
        this.author = author;
    }

    @Override
    public String toString() {
        return "[" + timestamp + "] " + author.getName() + ": " + content;
    }
}
