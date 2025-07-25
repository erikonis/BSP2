package lu.uni.programming1.lab10.exercise3;

public class Tool extends Software{

    public Tool(String name, int size) {
        super(name, size);
    }
    
    @Override
    public void install(Disk disk) throws Exception {
        try {
            checkOS(disk);
        } catch (OSException e) {
            throw e;
        }
        switch (disk.install(this)) {
        case ALREADYINSTALLED:
            System.out.println("Can't install " + super.getName() + " to " + disk + ": already installed.");
            break;
        case INSUFFICIENTSPACE:
            System.out.println("Can't install " + this + " to " + disk + ": insufficient space.");
            break;
        case SUCCESS:
            System.out.println("Installed " + this + " to " + disk);
        }
    }
    public void checkOS(Disk disk) throws OSException{
        if(disk.getOperatingSystem()==OperatingSystem.MACOS)
            throw new OSException("This Tool "+super.getName()+" cannot be installed on the "+disk.toString());

    }
}
