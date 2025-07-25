package lu.uni.programming1.lab8.exercise1;

public class Item {

private String name;

public Item(String name){
    this.name = name;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

@Override
public String toString(){
    return "\t Item: " + name + ",\n";
}


}


