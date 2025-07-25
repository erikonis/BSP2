public class Tool extends Software {
    public Tool(String name, int size)
    {
        super(name, size);
    }

    @Override
    public void install(Disk disk)
    {
        try {
            if(disk.getOperatingSystem()!=OperatingSystem.MACOS) disk.install(this);
            else throw new InvalidOS(this, disk);
        } catch (InvalidOS e) {
            System.out.println(e.getTool().getName()+" cannot be installed to "+e.getDisk().getUser()+" because it cant be installed into macos");
        }
    }
}
