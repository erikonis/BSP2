package lu.uni.programming1.lab10.exercise3;

public class SoftwareNotInstallableException extends Exception {
    
    private User user;
    private Software software;
    private Disk disk;

    public SoftwareNotInstallableException(Disk disk, Software software) {
        this.user = disk.getUser();
        this.software = software;
        this.disk = disk;
    }

    public Software getSoftware() {
        return software;
    }

    public User getUser() {
        return user;
    }

    public Disk getDisk() {
        return disk;
    }

}
