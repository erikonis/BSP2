package lu.uni.programming1.lab10.exercise3.exeptions;

import lu.uni.programming1.lab10.exercise3.Disk;
import lu.uni.programming1.lab10.exercise3.Tool;

public class MacOsException extends Exception {
    private Tool tool;
    private Disk disk;

    public MacOsException(Tool tool, Disk disk){
        this.setDisk(disk);
        this.setTool(tool);
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }
}
