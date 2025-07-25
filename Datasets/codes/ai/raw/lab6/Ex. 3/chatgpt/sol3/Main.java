package exercise3;

public class Main {
    public static void main(String[] args) {
        User alice = new User("U1", "Alice");
        User bob = new User("U2", "Bob");
        User charlie = new User("U3", "Charlie");
        Page techPage = new Page("P1", "Tech News");

        alice.addFriend(bob);

        System.out.println("\n🔹 Alice posts a public status:");
        alice.addPost("Hello world! Anyone can see this!", new PublicPrivacy());

        System.out.println("\n🔹 Alice posts a friends-only status:");
        alice.addPost("Hey Bob, this is private to friends only!", new FriendsOnlyPrivacy());

        System.out.println("\n🔹 Alice posts a restricted post (Only Bob can see it):");
        RestrictedPrivacy restricted = new RestrictedPrivacy();
        restricted.allowUser(bob);
        alice.addPost("Bob, this is just for you!", restricted);

        System.out.println("\n🔹 Tech News posts a public update:");
        techPage.addPost("Breaking: New AI technology released!", new PublicPrivacy());

        System.out.println("\n🔹 Bob checks Alice's timeline:");
        alice.showTimeline(bob);

        System.out.println("\n🔹 Charlie checks Alice's timeline:");
        alice.showTimeline(charlie);

        System.out.println("\n🔹 Alice checks Tech News Page:");
        techPage.showTimeline(alice);
    }
}
