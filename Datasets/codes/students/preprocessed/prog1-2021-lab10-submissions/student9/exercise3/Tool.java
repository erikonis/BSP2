public class Tool extends Software
{
    public Tool(String name, int size) {
        super(name, size);
    }
    
    @Override
    public void install(Disk disk) throws Exception 
    {
        if(!(disk.getOperatingSystem().equals(OperatingSystem.MACOS)))
        {
            super.install(disk);
        }
        else
        {
            throw new ToolDiskException("You are using MACOS so that is why it cannot be downloaded");
        }
    }
}
