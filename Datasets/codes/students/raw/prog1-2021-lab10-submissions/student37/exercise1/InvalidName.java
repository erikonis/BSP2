package lu.uni.programming1.lab10.exercise1;

public class InvalidName extends Exception {
    String name;
    public InvalidName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        if(name.equals("")) return "Invalid character name (name can't be empty): ";
        else if (name.length() > 20) return "Invalid character name (name is too long - max 20 characters): "+name;
        return "";
    }
}
