public abstract class Software {
    private String name;

    public Software(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract InstallStatus install(Disk disk, User user) throws InstallationException;
    public abstract void accept(SoftwareVisitor visitor, Disk disk, User user) throws InstallationException;
}