public class InvalidOS extends Exception{
    Tool tool;
    Disk disk;

    public InvalidOS(Tool tool, Disk disk)
    {
        this.tool = tool;
        this.disk = disk;
    }

    public Tool getTool(){return tool;}
    public Disk getDisk(){return disk;}
}
