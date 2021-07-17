import java.util.ArrayList;
import java.util.List;

public class Order {
	private long orderId;
	private String orderName;
	private List<OrderItem> orderItemList = new ArrayList<OrderItem>();

	public Order(long orderId, String orderName) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public List<OrderItem> getOrderItemList() {
		return orderItemList;
	}

	public void setOrderItemList(List<OrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}

}
