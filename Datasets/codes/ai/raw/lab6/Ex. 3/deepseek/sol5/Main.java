public class Main {
    public static void main(String[] args) {
        // Create profiles
        User alice = new User("Alice");
        User bob = new User("Bob");
        Page techPage = new Page("Tech News");
        
        // Add posts
        alice.addPost("Enjoying my weekend!");
        bob.addPost("Working on a new project");
        techPage.addPost("New smartphone released");
        techPage.like();
        techPage.like();
        
        // Test visibility
        System.out.println("=== Initial Attempt ===");
        alice.displayPosts(bob); // Bob can't see Alice's posts
        
        // Make friends
        alice.addFriend(bob);
        
        System.out.println("\n=== After Friendship ===");
        alice.displayPosts(bob); // Now Bob can see
        
        System.out.println("\n=== Page Visibility ===");
        techPage.displayPosts(alice); // Anyone can see pages
    }
}