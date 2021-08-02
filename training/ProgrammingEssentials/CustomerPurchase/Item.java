package CustomerPurchase;

public class Item {
    private int itemCode;
    private String itemName;
    private String description;
    private double price;

    Item(int itemCode, String itemName, String description, double price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.description = description;
        this.price = price;
    }

    public int itemCode(){
        return itemCode;
    }

    public String itemName(){
        return itemName;
    }

    public String getDescription(){
        return description;
    }
    
    public double getPrice(){
        return price;
    }

}
