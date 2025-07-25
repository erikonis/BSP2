package lu.uni.programming1.lab10.exercise3;

public class Tool extends Software {

    public Tool(String name, int size) {
        super(name, size);
    }
    
    @Override
    public void install(Disk disk) throws Exception {
        if(disk.getOperatingSystem().equals(OperatingSystem.MACOS)) {
            switch (disk.install(this)) {
                case ALREADYINSTALLED:
                    System.out.println("Can't install " + this.getName() + " to " + disk + ": already installed.");
                    break;
                case INSUFFICIENTSPACE:
                    System.out.println("Can't install " + this + " to " + disk + ": insufficient space.");
                    break;
                case SUCCESS:
                    System.out.println("Installed " + this + " to " + disk);
                }
        }
        else {
            throw new InvalidOSException(this,disk);
        }
    }
}
