package Exercise3;

public class User extends Profile {
    private User friends[] = new User [100];
    private int friendsn=0;

    public User(String name) {
        super(name);
    }

    public void addFriend(User f)
    {if(!isFriend(f)) 
        {friends[friendsn++]= f;
         f.addFriend(this);
      }

    }

    public boolean isFriend(Profile f)
    {for(int i=0;i<friendsn;i++)
        if(friends[i]==f)
        return true;
     return false;


    }

    public String viewTimeline(Profile u1)
    {
        if(u1.isPage()||isFriend(u1))
            return u1.timeline();
        else return super.getName()+" is not friends with "+u1.getName()+", so the timeline is unavalable. \n";
    }

    
}
