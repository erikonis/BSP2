import java.util.ArrayList;
import java.util.List;

public class lauch {
    public static void main(String[] args) {
        Order o1 = new Order("oreo", 0.30, 11);
        Order o2 = new Order("oreo", 0.30, 11);

        List<Order> list = new ArrayList<>(); 
        list.add(o1);
        list.add(o2);

        
        List<Integer> hashList = new ArrayList<Integer>();


        for (Order i : list){
            int val = i.hashCode();
            hashList.add(val);
        }
        for (int i = 0; i < hashList.size() - 1; i++) {
            int db = hashList.get(i);
            for (int j = i + 1; j <hashList.size(); j++) {
                int db2 = hashList.get(j);
        
                if (db==db2) {
                    list.remove(i);
                }
                else{}
            }
        }
        Orderlist theOne = new Orderlist(list);        



        
        
    }

   
}
