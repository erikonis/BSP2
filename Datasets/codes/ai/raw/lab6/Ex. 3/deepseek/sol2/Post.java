import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {
    private static final DateTimeFormatter FORMATTER = 
        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    
    private final Profile author;
    private final String content;
    private final LocalDateTime timestamp;

    public Post(Profile author, String content) {
        this.author = author;
        this.content = content;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "[" + timestamp.format(FORMATTER) + "] " + 
               author.getName() + ": " + content;
    }
}