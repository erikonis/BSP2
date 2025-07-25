
public class Control {
    private String cAction;
    private String dAction;
    

    public Control(String create, String doit) {
        this.cAction = create;
        this.dAction = doit;
        
    }


    public String getDAction() {
        return dAction;
    }


    public void setDAction(String dAction) {
        this.dAction = dAction;
    }


    public String getCAction() {
        return cAction;
    }


    public void setCAction(String cAction) {
        this.cAction = cAction;
    }


    @Override
    public String toString() {
        return "Control [cAction=" + cAction + ", dAction=" + dAction + "]";
    }
    

}
