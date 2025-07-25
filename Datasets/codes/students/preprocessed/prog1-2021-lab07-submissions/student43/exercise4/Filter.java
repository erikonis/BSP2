public abstract class Filter {

private Individual[] list;

public Filter(Individual[] list) {
    this.list=list;
}

protected abstract void ApplyFilter();

public int GetListSize() {
    return list.length;
}

public Individual GetListElement(int i) {
    return list[i];
}

public void show(Individual[] input) {
    for (int i = 0 ; i < input.length ; i++) {
        System.out.println(input[i]);
        System.out.println("\n");
    }
}



}
