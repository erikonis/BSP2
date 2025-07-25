package lu.uni.programming1.lab10.exercise3;

public class Tool extends Software {

    public Tool(String name, int size) {
        super(name, size);
    }
    
    @Override
    public void install(Disk disk) throws OSNotCompatibleException {
        try {
            if (disk.getOperatingSystem() == OperatingSystem.MACOS) {
                throw new Exception();
            } else {
                super.install(disk);
            }
        } catch (Exception e) {
            throw new OSNotCompatibleException(this, disk);
        }
        
        
        
    }

}
