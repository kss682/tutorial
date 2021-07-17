
public class Item {
	private String itemDescription;
	private double rate;

	public String getItemDescription() {
		return itemDescription;
	}

	public Item(String itemDescription, double rate) {
		this.itemDescription = itemDescription;
		this.rate = rate;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

}
