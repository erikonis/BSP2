import java.time.LocalDate;

public class Action
{
    private LocalDate d = LocalDate.now();
    private Character character;

    public Action(Character c1)
    {
        character = c1;
    }

    public String toArray()
    {
        return "Time: " + getDate() + ", user: " + character.getName();
    }

    public LocalDate getDate()
    {
        return d;
    }
}