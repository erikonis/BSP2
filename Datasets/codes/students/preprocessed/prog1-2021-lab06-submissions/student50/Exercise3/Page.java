

public class Page extends Profile{
    private int likec=0;
    private Profile likers[] = new Profile[100];

    public Page(String name) {
        super(name);
    }

    public void like(Profile p)
    {likers[likec++]=p;
    }

    

    public String viewTimeline() {
        return likec+" people like this page:  \n"+super.timeline();
    }

    
    
    
}
