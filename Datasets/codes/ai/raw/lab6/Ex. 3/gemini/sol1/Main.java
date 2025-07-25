package exercise3;

public class Main {
    public static void main(Stringargs) {
        User user1 = new User(1, "Alice");
        User user2 = new User(2, "Bob");
        Page page1 = new Page(3, "Cool Page");

        user1.addFriend(user2);
        page1.addLike();
        page1.addLike();

        user1.addPost("Hello, world!");
        page1.addPost("Check out our new product!");

        user1.showTimeline(user2); // Friend - visible
        user2.showTimeline(user1); // Not a friend - private
        page1.showTimeline(user1); // Page - visible
    }
}