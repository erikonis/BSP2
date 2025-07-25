package Exercise1;

public class Item {
    private String name;

    public Item(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name + ",\n";
    }    
}
