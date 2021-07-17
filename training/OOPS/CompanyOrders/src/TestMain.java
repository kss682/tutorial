
public class TestMain {
	public static void main(String args[]) {
		Company company = new Company();
		
		Customer customer1 = new Customer(1, "Sam");
		Customer customer2 = new Customer(2, "Bob");
		RegCustomer regCustomer = new RegCustomer(2, "Sara", 5);
		
		company.getCustomerList().add(customer1);
		company.getCustomerList().add(customer2);
		company.getCustomerList().add(regCustomer);
		
		Item item1 = new Item("Item1", 2000);
		Item item2 = new Item("Item2", 5000);
		
		Order order1 = new Order(101, "order 1");
		Order order2 = new Order(102, "order 2");
		
		OrderItem orderItem1 = new OrderItem(20, item1);
		OrderItem orderItem2 = new OrderItem(10, item2);
		order1.getOrderItemList().add(orderItem1);
		order2.getOrderItemList().add(orderItem2);
		
		customer1.getOrderList().add(order1);
		customer2.getOrderList().add(order2);
		regCustomer.getOrderList().add(order1);
		regCustomer.getOrderList().add(order2);
		
		System.out.printf("Total worth: %.2f", company.getTotalWorthOfOrdersPlaced());
	}
}
