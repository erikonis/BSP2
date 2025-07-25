public class Shop {
    private int localNumberOfGiveaways=0;
    private int maxNumberOfGiveaways=0;
    int returnValue=0;
    public Shop(int localNumberOfGiveaways,int maxNumberOfGiveaways) {
        this.setLocalNumberOfGiveaways(localNumberOfGiveaways);
        this.setMaxNumberOfGiveaways(maxNumberOfGiveaways);
    }

    public int getMaxNumberOfGiveaways() {
        return maxNumberOfGiveaways;
    }

    public void setMaxNumberOfGiveaways(int maxNumberOfGiveaways) {
        this.maxNumberOfGiveaways = maxNumberOfGiveaways;
    }

    public int getLocalNumberOfGiveaways() {
        return localNumberOfGiveaways;
    }

    public void setLocalNumberOfGiveaways(int localNumberOfGiveaways) {
        this.localNumberOfGiveaways = localNumberOfGiveaways;
    }

    public void buy(Item item) {
        System.out.println("The price of the item is " + item.getPrice());
        if(localNumberOfGiveaways == 0 ||maxNumberOfGiveaways == 0){
            System.out.println("Sorry, there are no giveaways available.");
        }
        else if(localNumberOfGiveaways!=0 && maxNumberOfGiveaways!=0){
            int randomValue = (int)Math.floor(Math.random()*(100-1+1)+1);

            if(item.getPrice()<20){
                returnValue = randomValue <= 2 ? 1 : 0;
            }else if(item.getPrice()>=20 && item.getPrice()<=100){
                returnValue = randomValue <= 5 ? 1 : 0;
            }else if(item.getPrice()>100){
                returnValue = randomValue <= 10 ? 1 : 0;
            }

        }
        if(returnValue==1){
            System.out.println("Congratulations, you have successfully won!");
            localNumberOfGiveaways=localNumberOfGiveaways-1;
            maxNumberOfGiveaways=maxNumberOfGiveaways-1;
        }
    }
}
