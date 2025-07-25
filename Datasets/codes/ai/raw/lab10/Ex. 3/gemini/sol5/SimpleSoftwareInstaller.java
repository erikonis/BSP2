// SimpleSoftwareInstaller.java (Applies Aspects)
import java.util.ArrayList;
import java.util.List;

public class SimpleSoftwareInstaller {
    private List<InstallationAspect> aspects = new ArrayList<>();

    public void addAspect(InstallationAspect aspect) {
        aspects.add(aspect);
    }

    public InstallStatus install(Software software, Disk disk, User user) throws InstallationException {
        InstallationInvocation invocation = (s, d, u) -> d.installSoftware(s); // Core logic

        for (int i = aspects.size() - 1; i >= 0; i--) { // Apply aspects in reverse order
            InstallationAspect aspect = aspects.get(i);
            final InstallationInvocation nextInvocation = invocation;
            invocation = (s, d, u) -> aspect.aroundInstall(s, d, u, nextInvocation);
        }

        return invocation.invoke(software, disk, user);
    }
}