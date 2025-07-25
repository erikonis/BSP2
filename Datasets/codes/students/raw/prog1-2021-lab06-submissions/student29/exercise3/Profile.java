package lu.uni.programming1.lab6.exercise3;

import java.util.UUID;
import java.util.ArrayList;
import java.util.List;

public class Profile {

    private String ID;

    private List<String> posts;

    private String name;

    public Profile(String name) {
        this.name = name;
        this.posts = new ArrayList<>();
        setID();
    }

    public void createPost(String post) {
        posts.add(post);
    }

    //At the end I realised that the method below can be used on its own in Launcher.java, which doesn't respect the privacy of users
    //But I also realised that if I implemented the method into the methods of other classes, I would make the list containing all the posts accessible to Launcher
    public String showPosts() {
        
        if (posts.size() == 0) {
            return name + " has not yet created any posts!";

        } else {
            String allPosts = getName() + "'s posts are: \n";

            for (int i = 0; i < posts.size(); i++) {
                allPosts += posts.get(i) + "\n";
            }
            
            return allPosts;
        }
    }

    private void setID() {
        ID = UUID.randomUUID().toString();
    }

    public String getID() {
        return ID.toString();
    }

    public String getName() {
        return name;
    }

}
