package CustomerPurchase;
import java.util.List;

public class BillCalculator {
    public static double calculateBill(List<UserPurchase> userPurchases){
        double total_price = 0;
        for(UserPurchase up: userPurchases){
            total_price += up.getQuantity()*up.getItem().getPrice();
        }
        return total_price;
    }

    public static double calculateDiscount(double price){
        if(price >= 10000){
            return price - (price*10)/100;
        }
        return price;
    }

    public static double calculateSurcharge(double price){
        if(price < 1000){
            return price + (price*2.5)/100;
        }
        return price;
    }
}
