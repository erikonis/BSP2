public class User extends Profile {

    private static final int FRIENDS_LIMIT = 5;

    private User[] friends;
    private int nextFriendPosition = 0;

    public User(String name) {
        super(name);
        this.friends = new User[FRIENDS_LIMIT];
    }

    public void addFriend(User u, boolean mutually) {
        if (this.nextFriendPosition < FRIENDS_LIMIT) {
            this.friends[this.nextFriendPosition++] = u;
            if (mutually)
                u.addFriend(this, false);
            this.createPost(this + " is now friends with " + u);
        } else {
            System.err.println("You've reached the maximum number of friends. Consider creating a page.");
        }
    }

    public boolean isFriend(User u) {
        for (int i = 0; i < nextFriendPosition; i++) {
            if (this.friends[i].getId().equals(u.getId())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void showTimeline(User observer) {
        if (this.isFriend(observer)) {
            super.showTimeline(observer);
        } else {
            System.err.println("User " + observer + " is not a friend of you and thus cannot see your timeline!");
        }
    }
}