
public class OrderItem {
	private int quantity;
	private Item item;

	public OrderItem(int quantity, Item item) {
		super();
		this.quantity = quantity;
		this.item = item;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
