package lu.uni.programming1.lab10.exercise3;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Tool extends Software{
    String name;
    boolean isinstalled, hasMacOS;
    double diskSpace;
    List<Tool>tools = new LinkedList<>();

    Tool(UUID licence, double diskSpace, String name) {
        this.name = name;
        this.licence = licence;
        this.diskSpace = diskSpace;
    }

    public String getName() {
        return name;
    }

    public boolean HasInstalled() {
        return isinstalled;
    }

    public boolean HasMacOS() {
        return hasMacOS;
    }

    public void Install(Tool tool){
            try{
                tools.add(tool);
            }catch (Exception e){
                System.out.println();
            }
            finally {
                if(HasInstalled() == true)
                    System.out.println("already installed");
                if(HasMacOS()) {
                    System.out.println(tool.getName() + " is installed with success.");
                    tool.isinstalled = true;
                }
                else System.out.println("not mac os !");
            }
        }
}
