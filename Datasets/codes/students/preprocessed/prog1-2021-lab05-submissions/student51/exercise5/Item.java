import java.util.Random;

public class Item {
    
    Random random = new Random();   
    private  double price,min,max;
    
    Item(){}
    Item(double price){
        this.price=price;
    }

    public void setInitialPrice(){
        min=0;
        max=121;           
        price = Math.floor(Math.random()*(max-min+1)+min);
    }
    
    public double getInitialPrice(){
        return price;
    }
}
