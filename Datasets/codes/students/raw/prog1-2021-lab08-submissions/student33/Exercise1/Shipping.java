package Exercise1;

public class Shipping {
    private Recipient recipient;
    private Item item;
    private ShippingMethod shippingMethod;
    private Country country;
    private Double totalCost;


    public Shipping(Recipient recipient, Item item, ShippingMethod shippingMethod, Country country) {
        this.setRecipient(recipient);
        this.setItem(item);
        this.setShippingMethod(shippingMethod);
        this.setCountry(country);
        this.totalCost = this.getCostOfCountry() + this.getCostOfShipping();
        

    }

    public Double getTotalCost() {
        return totalCost;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public ShippingMethod getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

private Double getCostOfCountry() {
        Double price = 0.00;
        switch (this.country) {
            case FRANCE:
                price = 30.00;
                break;
            case BELGIUM:
                price = 50.00;
                break;
            case GERMANY:
                price = 40.00;
                break;

            default:
                price = 0.00;
                break;
        }
        return price;
    }

private Double getCostOfShipping() {
        Double price = 0.00;
        switch (this.shippingMethod) {
            
            case EXPRESS:
                price = 100.00;
                break;
            case PRIORITY:
                price = 50.00;
                break;
            case CLASSIC:
                price = 10.00;
                break;

            default:
                price = 0.00;
                break;
        }
        return price;
    }



    private String getHandling() {
        String handlingTime;
        switch (this.shippingMethod) {
            case EXPRESS:
            handlingTime = "1 day";
                break;
            case PRIORITY:
            handlingTime = "3 days";
                break;
            case CLASSIC:
            handlingTime = "5 days";
                break;

            default:
            handlingTime = "8 days";
                break;
        }
        return handlingTime;
    }

    @Override
    public String toString(){
        return "Shipping for " + recipient + "        Item: " + item + "        Shipping method: " + shippingMethod 
        + "[" + formatToEuro(getCostOfShipping()) + "]. Handling in "+ getHandling() 
        + ",\n        TOTAL Cost: " + formatToEuro(totalCost);
        // crochet sur mon clavier = option + shift + 5 (crochet ouvert) et 6 (crochet fermé)
        // QUESTION: Comment introduire le handling time dans mon programme ?
    } 
    
    private String formatToEuro(Double numberToFormat){
        return String.format("%.2f", numberToFormat) + " EUR";
    }
}
