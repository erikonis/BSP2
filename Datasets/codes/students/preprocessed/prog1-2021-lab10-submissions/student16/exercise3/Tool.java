public class Tool extends Software{

    public Tool(String name, int size) {
        super(name, size);
        
    }
    @Override
    public void install(Disk disk) throws Exception {
        if (disk.getOperatingSystem() != OperatingSystem.MACOS) {
            super.install(disk);
        }
        else{
            throw new NoOSException();
        }
    }
}
