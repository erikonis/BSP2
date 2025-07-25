enum Countries{

    Luxembourg, Belgium, France, Germany;
}

public class Launcher {

    public static void main(String[] args) {

        
Person person = new Person("John Doe", "35 rue Oscar Romeo", Countries.Germany);
Item item = new Item("Iphone X");

Orderprint(person.getName(),person.getAddress(),person.getCountry(), item.getName());


}



private static void Express(Countries Country) {

    if (Country ==  Countries.Germany){

        int price = 140;
        System.out.println("Shipping Method: Express[100€]. Handling in 1 Day! ");
        System.out.println("Total cost: "+price+"€");
        
    } else if (Country == Countries.Belgium){
        int price = 150;
        System.out.println("Shipping Method: Express[100€]. Handling in 1 Day! ");
        System.out.println("Total cost: "+price+"€");

    } else if (Country == Countries.France){
        int price = 130;
        System.out.println("Shipping Method: Express[100€]. Handling in 1 Day! ");
        System.out.println("Total cost: "+price+"€");
        
    } else if (Country == Countries.Luxembourg){
        int price = 100;
        System.out.println("Shipping Method: Express[100€]. Handling in 1 Day! ");
        System.out.println("Total cost: "+price+"€");
    }

}

private static void Priority(Countries Country){

    if (Country ==  Countries.Germany){
        int price = 90;
        System.out.println("Shipping Method: Priority[50€]. Handling in 3 Days! ");
        System.out.println("Total cost: "+price+"€");
        
    } else if (Country == Countries.Belgium){
        int price = 100;
        System.out.println("Shipping Method: Priority[50€]. Handling in 3 Days! ");
        System.out.println("Total cost: "+price+"€");

    } else if (Country == Countries.France){
        int price = 80;
        System.out.println("Shipping Method: Priority[50€]. Handling in 3 Days! ");
        System.out.println("Total cost: "+price+"€");
        
    } else if (Country == Countries.Luxembourg){
        int price = 50;
        System.out.println("Shipping Method: Priority[50€]. Handling in 3 Days! ");
        System.out.println("Total cost: "+price+"€");
    }


}

private static void Classic(Countries Country){

  
    if (Country ==  Countries.Germany){
        int price = 50;
        System.out.println("Shipping Method: Clasic[10€]. Handling in 5 Days! ");
        System.out.println("Total cost: "+price+"€");
        
    } else if (Country == Countries.Belgium){
        int price = 60;
        System.out.println("Shipping Method: Clasic[10€]. Handling in 5 Days! ");
        System.out.println("Total cost: "+price+"€");

    } else if (Country == Countries.France){
        int price = 40;
        System.out.println("Shipping Method: Clasic[10€]. Handling in 5 Days! ");
        System.out.println("Total cost: "+price+"€");

    } else if (Country == Countries.Luxembourg){
        int price = 10;
        System.out.println("Shipping Method: Clasic[10€]. Handling in 5 Days! ");
        System.out.println("Total cost: "+price+"€");
    }

}

private static void NoRush(Countries Country){
    
    if (Country ==  Countries.Germany){
        int price = 40;
        System.out.println("Shipping Method: NoRush[FREE]. Handling in 10 Days! ");
        System.out.println("Total cost: "+price+"€");
        
    } else if (Country == Countries.Belgium){
        int price = 50;
        System.out.println("Shipping Method: NoRush[FREE]. Handling in 10 Days! ");
        System.out.println("Total cost: "+price+"€");

    } else if (Country == Countries.France){
        int price = 30;
        System.out.println("Shipping Method: NoRush[FREE]. Handling in 10 Days! ");
        System.out.println("Total cost: "+price+"€");
        
    } else if (Country == Countries.Luxembourg){
        int price = 0;
        System.out.println("Shipping Method: NoRush[FREE]. Handling in 10 Days! ");
        System.out.println("Total cost: "+price+"€");

    }

} 

private static void Orderprint(String Name, String Address, Countries Country, String item ){
System.out.println("Shipping for "+Name+", "+Address+", "+Country);
System.out.println("Item: "+item);
Classic(Country);
}

}
