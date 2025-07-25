public class EnumTest {
    private Country country;
    private shipmentart shipment;
    private int cost;
    private String name;
    private String address;
    private String itemname;
    private int shiptime;
    private int shipextracost;;



    enum Country {

        Luxembourg, France, Belgium, Germany

    }
    enum shipmentart{
        Express, Priority, Classic,Norush
    }
    

    public EnumTest(Country country, shipmentart shipment, String name, String address, String itemname) {
        this.country = country;
        this.shipment = shipment;
        this.name = name;
        this.address = address;
        this.itemname = itemname;
    }
    public void shipcost(shipmentart shipment){
        switch(shipment)
        {
            case Express:
            cost=cost+100;
            shiptime=1;
            shipextracost=100;
            break;
            case Priority:
            cost=cost+50;
            shiptime=3;
            shipextracost=50;
            break;
            case Classic:
            cost=cost+10;
            shiptime=5;
            shipextracost=40;
            break;
            case Norush:
            shiptime=8;
            shipextracost=0;
            break;
            
        }
    }
    public void countryship(Country country)
    {
        switch(country)
        {
            case France:
            cost=cost+30;
            break;
            case Belgium:
            cost=cost+50;
            break;
            case Germany:
            cost=cost+40;
            break;
        }
    }
    public void output()
    {
        System.out.println("Shipping for "+name+", ("+address+", "+country.name()+"),");
        System.out.println("Item: "+itemname+",");
        System.out.println("Shipping method:"+shipment.name()+"["+shipextracost+"]. Handling in "+shiptime+" day;");
        System.out.println("TOTAL cost: "+cost+" EUR");
    }
    

    


}
