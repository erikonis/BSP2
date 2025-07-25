import java.util.UUID;

public class Games extends Software
{
    private UUID id;
    public Games(String name, int size) {
        super(name, size);
        id = UUID.randomUUID();
    }
    
    public UUID gerID()
    {
        return id;
    }

    @Override
    public void install(Disk d) throws Exception
    {
        User u = d.getUser();

        if(u.ownsGameLicense(id))
        {
            super.install(d);
        }
        else
        {
            throw new GameUseerException("This game is not owned by the user at this point in time");
        }
    }
}