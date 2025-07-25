import java.rmi.AlreadyBoundException;

public class ExistingCharacterArgument extends AlreadyBoundException
{
    public ExistingCharacterArgument(String m)
    {
        super(m);
    }
}
