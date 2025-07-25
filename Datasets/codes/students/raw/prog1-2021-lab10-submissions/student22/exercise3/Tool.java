package lu.uni.programming1.lab10.exercise3;

public class Tool extends Software {

    public Tool(String name, int size) {
        super(name, size);
    }
    
    public void install(Disk disk) throws Exception{
        if(!disk.getOperatingSystem().equals(OperatingSystem.MACOS)){
            super.install(disk);
        } else {
            System.out.println("Installation not possible: incompatible operation system.");
        }
        
    }
}
