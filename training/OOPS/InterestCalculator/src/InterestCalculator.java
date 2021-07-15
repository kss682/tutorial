
public class InterestCalculator {
	private double principle;
	private int time;
	private double intRate;

	InterestCalculator(double principle, int time) {
		this.principle = principle;
		this.time = time;
		if (time >= 5) {
			this.intRate = 10;
		} else {
			this.intRate = 12;
		}
	}

	public double getInterest() {
		return (principle * time * intRate) / 100;
	}
}
