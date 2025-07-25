package exercise3;

public class Main {
    public static void main(String[] args) {
        User alice = new User("U1", "Alice");
        User bob = new User("U2", "Bob");
        Page techPage = new Page("P1", "Tech News");

        alice.addPost("Hello world! This is my first post.");
        bob.addPost("Excited for my new job!");
        techPage.addPost("Breaking: New AI technology released!");

        System.out.println("\n🔹 Alice tries to see Bob's timeline (not friends yet):");
        bob.showTimeline(alice);

        System.out.println("\n🔹 Alice and Bob become friends:");
        alice.addFriend(bob);

        System.out.println("\n🔹 Alice sees Bob's timeline:");
        bob.showTimeline(alice);

        System.out.println("\n🔹 Public Page Timeline:");
        techPage.showTimeline(alice);

        System.out.println("\n🔹 Bob likes the Tech News page:");
        techPage.likePage();
    }
}
