public class Tool extends Software {

    public Tool(String name, int size) {
        super(name, size);
    }
    
    @Override
    public void install(Disk disk) throws Exception{
        OperatingSystem operatingSystem = disk.getOperatingSystem();
        if(operatingSystem!=OperatingSystem.MACOS){
            super.install(disk);
        }else{
            throw new NotSupportedOSException("This tool cannot be installed in a "+operatingSystem+" running system.");
        }
    }
}
