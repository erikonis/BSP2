public class Tool extends Software{

    public Tool(String name, int size) {
        super(name, size);
    }
    
    public void install(Disk disk) throws Exception{
        if(disk.getOperatingSystem().equals(OperatingSystem.MACOS)){
            System.out.println("You can not install a tool on a disk which runs MacOS");
        }
        else{
            super.install(disk);
        }
    }
}
