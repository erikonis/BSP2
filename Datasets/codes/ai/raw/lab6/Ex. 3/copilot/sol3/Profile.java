package exercise3;

import java.util.Date;

public class Post {
    private String content;
    private Date timestamp;

    public Post(String content) {
        this.content = content;
        this.timestamp = new Date();
    }

    public String getContent() {
        return content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Post{" +
                "content='" + content + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}