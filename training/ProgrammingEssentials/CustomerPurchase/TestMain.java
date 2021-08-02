package CustomerPurchase;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class TestMain {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String ch;

        System.out.println("-------------------------------------------------------------");
        
        List<Item> itemList = new ArrayList<Item>();
        List<UserPurchase> userPurchasesList = new ArrayList<UserPurchase>(); 
        int itemCode;
        String itemName;
        String description;
        double price;

        while(true){
            System.out.println("Add an item(Y/N).");
            ch = sc.next();
            if(ch == "N"){
                break;
            }
            System.out.println("Enter item details");
            System.out.println("Enter item code: ");
            itemCode = sc.nextInt();
            System.out.println("Enter item name: ");
            itemName = sc.next();
            System.out.println("Enter item description: ");
            description = sc.next();
            System.out.println("Enter item price: ");
            price = sc.nextDouble();     
            itemList.add(new Item(itemCode, itemName, description, price));
        }
        
        System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");
        
        String userName;
        int quantity;

        System.out.println("Enter user name");
        userName = sc.next();
        User user = new User(userName);
        while(true){
            System.out.println("Purchase another item(Y/N).");
            ch = sc.next();
            if(ch == "N"){
                break;
            }
            System.out.println("Enter item purchased");
            itemName = sc.next();
            System.out.println("Enter quantity of item purchased");
            quantity = sc.nextInt();
            for(Item item: itemList){
                if(item.itemName().contentEquals(itemName)){
                    userPurchasesList.add(new UserPurchase(user, item, quantity));
                }
            }
        }

        System.out.println("Payment mode: [Card/ Cash]");
        String payment_mode = sc.next();
        double total_price = BillCalculator.calculateBill(userPurchasesList);
        total_price = BillCalculator.calculateDiscount(total_price);
        if(payment_mode == "Card"){
            total_price = BillCalculator.calculateSurcharge(total_price);
        }
        System.out.printf("Grand total: %.2f", total_price);
    }
}
