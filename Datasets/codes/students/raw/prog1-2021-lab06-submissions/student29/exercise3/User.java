package lu.uni.programming1.lab6.exercise3;

import java.util.List;
import java.util.ArrayList;

public class User extends Profile {
    
    private List<String> friends;

    //prevents pages from being liked twice
    private List<Page> liked;

    public User(String name) {
        super(name);
        friends = new ArrayList<>();
        liked = new ArrayList<>();
    }

    public void addFriend(User friend) {
        //adds friend to both users if they are not yet friends (else this would be an infinite loop and duplicated would be possible)
        if (!befriended(friend)) {
            friends.add(friend.getID());
            friend.addFriend(this);
        }
    }

    public String showTo(User user) {
        if (friends.contains(user.getID())) {
            return super.showPosts();
        } else {
            return "You can't watch " + super.getName() +  "'s posts because you currently are not befriended with " + super.getName() + ".";
        }
    }

    public boolean befriended(User user) {
        boolean befriended = false;

        for (int i = 0; i < friends.size() && !befriended; i++) {
            if (friends.get(i).equals(user.getID())) {
                befriended = true;
            }
        }

        return befriended;
    }

    public List<Page> getLikedPages() {
        return liked;
    }

    public void addLiked(Page page) {
        liked.add(page);
    }

}
