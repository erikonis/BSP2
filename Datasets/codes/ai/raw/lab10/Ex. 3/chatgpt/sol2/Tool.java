public class Tool extends Software {

    public Tool(String name) {
        super(name);
    }

    @Override
    public InstallStatus install(User user, Disk disk) throws ToolInstallException {
        if (disk.getOperatingSystem() == OperatingSystem.MACOS) {
            throw new ToolInstallException(this, disk);
        }
        return disk.installSoftware(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Tool)) return false;
        Tool other = (Tool) obj;
        return getName().equals(other.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
