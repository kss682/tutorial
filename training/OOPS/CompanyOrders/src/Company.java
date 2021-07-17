import java.util.ArrayList;
import java.util.List;

public class Company {
	private String name;
	private List<Customer> customerList = new ArrayList<Customer>();
	private List<Item> itemList = new ArrayList<Item>();

	public Company(String name, List<Customer> customerList, List<Item> itemList) {
		super();
		this.name = name;
		this.customerList = customerList;
		this.itemList = itemList;
	}

	public Company() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public double getTotalWorthOfOrdersPlaced() {
		double totalWorth = 0;
		for(Customer customer: customerList) {
			double price = 0;
			for(Order order: customer.getOrderList()) {
					for(OrderItem orderItem: order.getOrderItemList()) {

						price += orderItem.getItem().getRate()*orderItem.getQuantity();
					}
				}	
			if(customer instanceof RegCustomer) {
				price = price - (price*((RegCustomer) customer).getSplDiscount()/100);
			}
			totalWorth += price;
		}
		return totalWorth;
	}
}
