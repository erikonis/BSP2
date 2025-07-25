public class Main {
    public static void main(String[] args) {
        // Create user profiles
        UserProfile alice = new UserProfile("alice123", "Alice Smith");
        UserProfile bob = new UserProfile("bob456", "Bob Johnson");
        UserProfile charlie = new UserProfile("charlie789", "Charlie Brown");

        // Create page profiles
        PageProfile coolPage = new PageProfile("coolpage1", "Cool Gadgets");
        PageProfile awesomeCafe = new PageProfile("cafe22", "Awesome Cafe");

        // Users adding friends
        alice.addFriend(bob);
        bob.addFriend(charlie);

        // Profiles creating posts
        alice.addPost("Just had a great morning!");
        bob.addPost("Coding session in progress...");
        coolPage.addPost("Check out our new SmartWatch!");
        awesomeCafe.addPost("Our new menu is out!");

        // Users liking pages
        alice.likePage();
        alice.likePage();
        bob.likePage();
        charlie.likePage();
        coolPage.likePage(); // A page liking itself doesn't make sense in a real scenario, but for testing...

        // Showing timelines

        System.out.println("\n--- Showing Timelines ---");

        System.out.println("\nAlice's Timeline (viewed by Alice):");
        alice.showTimeline(alice);

        System.out.println("\nAlice's Timeline (viewed by Bob):");
        alice.showTimeline(bob);

        System.out.println("\nAlice's Timeline (viewed by Charlie):");
        alice.showTimeline(charlie);

        System.out.println("\nBob's Timeline (viewed by Alice):");
        bob.showTimeline(alice);

        System.out.println("\nBob's Timeline (viewed by Charlie):");
        bob.showTimeline(charlie);

        System.out.println("\nCharlie's Timeline (viewed by Bob):");
        charlie.showTimeline(bob);

        System.out.println("\nCool Gadgets' Timeline (viewed by Alice):");
        coolPage.showTimeline(alice);

        System.out.println("\nAwesome Cafe's Timeline (viewed by Bob):");
        awesomeCafe.showTimeline(bob);

        System.out.println("\nAlice tries to view Cool Gadgets' Timeline (as a User viewing a Page):");
        coolPage.showTimeline(alice); // Timeline of a page is public

        System.out.println("\nCool Gadgets tries to view Alice's Timeline (as a Page viewing a User):");
        alice.showTimeline(coolPage); // Pages cannot view user timelines (as per the requirement)
    }
}