public class ConsumableItem {


    final private boolean sellable= true; 

    private String potionName;
    private double potionQuantity;
    private int potionCharge;
    private boolean outOfCharges; 



    public ConsumableItem() {
    }

    public ConsumableItem(String potionName, double potionQuantity, int potionCharge, boolean outOfCharges) {
        this.potionName = potionName;
        this.potionQuantity = potionQuantity;
        this.potionCharge = potionCharge;
        this.outOfCharges = outOfCharges;
    }

    public boolean isSellable() {
        return this.sellable;
    }

    public boolean getSellable() {
        return this.sellable;
    }


    public String getPotionName() {
        return this.potionName;
    }

    public void setPotionName(String potionName) {
        this.potionName = potionName;
    }

    public double getPotionQuantity() {
        return this.potionQuantity;
    }

    public void setPotionQuantity(double potionQuantity) {
        this.potionQuantity = potionQuantity;
    }

    public int getPotionCharge() {
        return this.potionCharge;
    }

    public void setPotionCharge(int potionCharge) {
        this.potionCharge = potionCharge;
    }

    public boolean isOutOfCharges() {
        return this.outOfCharges;
    }

    public boolean getOutOfCharges() {
        return this.outOfCharges;
    }

    public void setOutOfCharges(boolean outOfCharges) {
        this.outOfCharges = outOfCharges;
    }

    public ConsumableItem potionName(String potionName) {
        setPotionName(potionName);
        return this;
    }

    public ConsumableItem potionQuantity(double potionQuantity) {
        setPotionQuantity(potionQuantity);
        return this;
    }

    public ConsumableItem potionCharge(int potionCharge) {
        setPotionCharge(potionCharge);
        return this;
    }

    public ConsumableItem outOfCharges(boolean outOfCharges) {
        setOutOfCharges(outOfCharges);
        return this;
    }

    // @Override
    // public boolean equals(Object o) {
    //     if (o == this)
    //         return true;
    //     if (!(o instanceof ConsumableItem)) {
    //         return false;
    //     }
    //     ConsumableItem consumableItem = (ConsumableItem) o;
    //     return sellable == consumableItem.sellable && Objects.equals(potionName, consumableItem.potionName) && potionQuantity == consumableItem.potionQuantity && potionCharge == consumableItem.potionCharge && outOfCharges == consumableItem.outOfCharges;
    // }

    // @Override
    // public int hashCode() {
    //     return this.hash(sellable, potionName, potionQuantity, potionCharge, outOfCharges);
    // }

    @Override
    public String toString() {
        return "{" +
            " sellable='" + isSellable() + "'" +
            ", potionName='" + getPotionName() + "'" +
            ", potionQuantity='" + getPotionQuantity() + "'" +
            ", potionCharge='" + getPotionCharge() + "'" +
            ", outOfCharges='" + isOutOfCharges() + "'" +
            "}";
    }


    
}
