package lu.uni.programming1.lab10.exercise1;

import java.rmi.AlreadyBoundException;

public class ExistingCharacterArgument extends AlreadyBoundException
{
    public ExistingCharacterArgument(String m)
    {
        super(m);
    }
}
