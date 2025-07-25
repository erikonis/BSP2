import java.util.ArrayList;
import java.util.List;

public class Disk {
    private int maximumSize;
    private final User user;
    private List<Software> installedSoftware;
    private OperatingSystem operatingSystem;

    public Disk(int maximumSize, User user, OperatingSystem operatingSystem) {
        this.maximumSize = Math.max(1, Math.min(1024, maximumSize));
        this.user = user;
        installedSoftware = new ArrayList<>();
        this.operatingSystem = operatingSystem;
    }

    public int getMaximumSize() {
        return maximumSize;
    }

    public int getAvailableSize() {
        int installedSize = 0;
        for (Software software : installedSoftware) {
            installedSize += software.getSize();
        }
        return maximumSize - installedSize;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    private boolean isInstalled(Software software) {
        return installedSoftware.contains(software);
    }

    public InstallStatus install(Software software) {
        if (!isInstalled(software)) {
            if (getAvailableSize() - software.getSize() >= 0) {
                installedSoftware.add(software);
                return InstallStatus.SUCCESS;
            } else {
                return InstallStatus.INSUFFICIENTSPACE;
            }
        }
        return InstallStatus.ALREADYINSTALLED;

    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Disk (" + getAvailableSize() + "GB available / " + maximumSize + "GB capacity) - " + user;
    }
}
