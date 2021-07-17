import java.util.List;

public class RegCustomer extends Customer {

	private double splDiscount;

	public RegCustomer(long customerId, String customerName, double splDiscount) {
		super(customerId, customerName);
		this.splDiscount = splDiscount;
	}

	public double getSplDiscount() {
		return splDiscount;
	}

	public void setSplDiscount(double splDiscount) {
		this.splDiscount = splDiscount;
	}

}
