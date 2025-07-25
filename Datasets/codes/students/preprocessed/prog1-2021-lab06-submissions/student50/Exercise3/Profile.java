

public class Profile {
    private static int nextID=1000;
    private int ID;
    private String name;
    private Post p[]= new Post[1000];
    private int postn=0;

    public Profile(String name) {
        this.name = name;
        ID=nextID++;
    }

    public void addPost(String message)
    {p[postn++]= new Post(message);
    }

        
    public String getName() {
        return name;
    }

    public boolean isPage()
    {   if(getClass()==Page.class)
        return true;
        else return false;
    }
    public String timeline() {
        String posts="";
        for(int i=0;i<postn;i++)
            posts=posts+"--------------------- \n"+"Post number #"+(i+1)+"\n"+ p[i].toString()+"\n ";
        return "ID " + ID + ": \n" + name + "\nNumber of posts:" + postn +"\n"+posts;
    }
    
    
}
