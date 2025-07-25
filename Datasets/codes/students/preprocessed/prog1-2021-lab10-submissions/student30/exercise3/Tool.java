import lu.uni.programming1.lab10.exercise3.exeptions.MacOsException;

public class Tool extends Software {

    public Tool(String name, int size) {
        super(name, size);

    }

    @Override
    public void install(Disk disk) throws Exception {
        if (disk.getOperatingSystem() == OperatingSystem.MACOS) {
            throw new MacOsException(this, disk);
        }
        super.install(disk);
        // we don't have 'else' because if the 'if' find an exception the code will stop
        // there.
    }
}
