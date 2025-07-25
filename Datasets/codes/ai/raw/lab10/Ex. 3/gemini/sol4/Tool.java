// Tool.java
public class Tool extends Software {

    public Tool(String name) {
        super(name);
    }

    @Override
    public InstallStatus install(Disk disk, User user) throws InstallationException {
        SoftwareInstaller installer = new ConcreteSoftwareInstaller();
        return installer.install(this, disk, user);
    }

    @Override
    public void accept(SoftwareVisitor visitor, Disk disk, User user) throws InstallationException {
        visitor.visit(this, disk, user);
    }
}