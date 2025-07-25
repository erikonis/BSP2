public class GearItem extends Item {
    private int criticalHit, determination, directHit;

    public GearItem(String name, int cost, String rarity, int criticalHit, int determination, int directHit) {
        super(name, cost, rarity);
        if (criticalHit >= 0 && determination >= 0 && directHit >= 0) {
            this.criticalHit = criticalHit;
            this.determination = determination;
            this.directHit = directHit;
        }
    }

    public int getCriticalHit() {
        return criticalHit;
    }

    public void setCriticalHit(int criticalHit) {
        this.criticalHit = criticalHit;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getDirectHit() {
        return directHit;
    }

    public void setDirectHit(int directHit) {
        this.directHit = directHit;
    }

    @Override
    public int compareTo(Item item) {
        int sum = getCriticalHit()+getDetermination()+getDirectHit();
        GearItem gItem = (GearItem) item;
        int sumItem = gItem.getCriticalHit()+gItem.getDetermination()+gItem.getDirectHit();
        if(sum > sumItem){
            return 1;
        }else if(sum < sumItem){
            return -1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " - " + getCriticalHit() + " Critical Hit / " + getDetermination() + " Determination / " + getDirectHit() + " Direct Hit";
    }

    

}
