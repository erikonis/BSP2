package lu.uni.programming1.lab5.exercise5;

public class Shop {
    private int localNumberOfGiveaways;
    private int maxNumberOfGiveaways;

    public Shop(int localNumberOfGiveaways, int maxNumberOfGiveaways) {
        this.localNumberOfGiveaways = localNumberOfGiveaways;
        this.maxNumberOfGiveaways = maxNumberOfGiveaways;
    }

    public void setMaxNumberOfGiveaways(int maxNumberOfGiveaways){
        this.maxNumberOfGiveaways = maxNumberOfGiveaways;
    }

    public int getLocalNumberOfGiveaways() {
        return this.localNumberOfGiveaways;
    }

    public int getMaxNumberOfGiveaways() {
        return this.maxNumberOfGiveaways;
    }


    public void buy(Item item){
        System.out.println("Price: " + item.getPrice());
        if(localNumberOfGiveaways == 0){
            System.out.println("Mo more giveaways left in this shop!");
        }
        else if(maxNumberOfGiveaways == 0){
            System.out.println("No more giveaways left in Luxembourg!");
        }
        else{
            int winner;
            if(item.getPrice() < 20){
                // The odds to get 1 from [1;50] are 2%
                winner = (int) (Math.random() * 50) + 1;
                if(winner == 1){
                    System.out.println("CONGRATULATIONS! You won!");
                    localNumberOfGiveaways--;
                    maxNumberOfGiveaways--;
                }
            }
            else if(item.getPrice() < 100){
                // The odds to get 1 from [1;20] are 5%
                winner = (int) (Math.random() * 20) + 1;
                if(winner == 1){
                    System.out.println("CONGRATULATIONS! You won!");
                    localNumberOfGiveaways--;
                    maxNumberOfGiveaways--;
                }
            }
            else{
                // The odds to get 1 from [1;10] are 10%
                winner = (int) (Math.random() * 10) + 1;
                if(winner == 1){
                    System.out.println("CONGRATULATIONS! You won!");
                    localNumberOfGiveaways--;
                    maxNumberOfGiveaways--;
                }
            }
        }
    }
}
