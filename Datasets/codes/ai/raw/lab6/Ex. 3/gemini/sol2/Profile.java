package exercise3_interface;

public interface Profile {
    int getId();
    String getName();
    void addPost(String post);
    void showTimeline(Profile viewer);
}