package lu.uni.programming1.lab5.exercise5;

public class Shop {
    private int localNumberOfGiveaways;
    private int maxNumberOfGiveaways;

    public Shop(int pLocal, int pGlobal){
        localNumberOfGiveaways = pLocal;
        maxNumberOfGiveaways = pGlobal;
    }

    public int getLocalNumberOfGiveaways(){
        return localNumberOfGiveaways; 
    }

    public void buy(Item item){
        if(localNumberOfGiveaways <= 0 || maxNumberOfGiveaways <= 0){
            System.out.println("There are no more giveaways left.");
        }
        else{
            int random = 0;
            int price =  item.getPrice();
            System.out.println("The price of the item is :" + price);
            if(price<=20){
                random = (int)((Math.random()*50))+1;             
            }
            else if(price<=100){
                random = (int)((Math.random()*20))+1;
            }
            else{
                random = (int)((Math.random()*10))+1;
            }
            if(random==1){
                System.out.println("Congratulations, you won a price !");
                localNumberOfGiveaways--;
                maxNumberOfGiveaways--;
            }
        }
    }
}
