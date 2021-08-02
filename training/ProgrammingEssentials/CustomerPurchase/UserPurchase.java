package CustomerPurchase;

public class UserPurchase {
    private User user;
    private Item item;
    private int quantity;

    UserPurchase(User user, Item item, int quantity){
        this.user = user;
        this.item = item;
        this.quantity = quantity;
    }

    public User getUser(){
        return user;
    }

    public Item getItem(){
        return item;
    }

    public int getQuantity(){
        return quantity;
    }
}
