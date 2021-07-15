import java.util.Scanner;

public class InterectCalculatorConsole {
	public static void main(String args[]) {
		double principle, interest;
		int time;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle amount.");
		principle = sc.nextDouble();
		System.out.println("Enter the time(in years).");
		time = sc.nextInt();
		
		InterestCalculator interestCalculator = new InterestCalculator(principle, time);
		interest = interestCalculator.getInterest();
		System.out.printf("The interest for principle of %.2f for %d years is %.2f\n", principle, time, interest);
	}
}
