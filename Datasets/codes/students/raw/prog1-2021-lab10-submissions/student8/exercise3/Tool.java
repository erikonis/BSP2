package lu.uni.programming1.lab10.exercise3;

public class Tool extends Software {

    public Tool(String name, int size) {
        super(name, size);
    }

    public void install(Disk disk)
    {
        if(disk.getOperatingSystem()!=OperatingSystem.MACOS)
        {
           Tool tool= new Tool(super.getName(),super.getSize());
            disk.install(tool);
        }
    }
    
}
