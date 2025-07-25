public class FacebookApp {
    public static void main(String[] args) {
        User alice = new User("Alice");
        User bob = new User("Bob");
        Page page = new Page("Tech News");

        alice.post("Hello world!");
        bob.post("Java is fun");
        page.post("New product launched");

        // Alice likes the page twice
        page.like();
        page.like();

        // Test visibility
        System.out.println("--- Alice viewing Bob's posts ---");
        bob.showPosts(alice); // Can't view (not friends)

        alice.addFriend(bob);
        System.out.println("\n--- After becoming friends ---");
        bob.showPosts(alice); // Can view

        System.out.println("\n--- Page visibility ---");
        page.showPosts(alice); // Anyone can view
    }
}