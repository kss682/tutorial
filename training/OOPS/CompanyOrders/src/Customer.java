import java.util.ArrayList;
import java.util.List;

public class Customer {
	private long customerId;
	private String customerName;
	private List<Order> orderList = new ArrayList<Order>();

	public Customer(long customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
