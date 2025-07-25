import java.util.HashSet;

public class Launcher {
    public static void main(String[] args) {

        HashSet<Item> list= new HashSet<>();

        Item i1= new Item(14.65 , "Skirt" , "Pink", 3);
        Item i2= new Item(12.50 , "Jeans" , "Blue", 2);
        Item i3= new Item(10.99 , "T-Shirt" , "White", 1);
        Item i4= new Item(14.65 , "Skirt" , "Pink", 3);
        Item i5= new Item(35.00 , "Shoes" , "Black", 3);
        Item i6= new Item(10.99 , "Sneakers" , "White", 1);
        Item i7= new Item(14.65 , "Skirt" , "Pink", 3);
        Item i71= new Item(14.65 , "Coat" , "Turquoise", 3);
        Item i72= new Item(14.65 , "Skirt" , "Pink", 2);

        //add 10000000 elements

        
       for(int i=1;i<=100000000;i++)
        {list.add(i1);
        list.add(i2);
        list.add(i3);
        list.add(i4);
        list.add(i5);
        list.add(i6);
        list.add(i7);
        list.add(i71);
        list.add(i72);
        }
    
      
        System.out.print(list);

    }
}
