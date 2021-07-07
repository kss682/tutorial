import java.util.Scanner;

class SimpleInterest{
	/*
	 *The Simple interest is calculated using the formula:
	 	(P*R*T/100)
	 */
	public static void main(String args[]){
		double principle, rate, interest;
		int time;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle:");
		principle = sc.nextDouble();
		System.out.println("Enter the rate:");
		rate = sc.nextDouble();
		System.out.println("Enter the time(in years):");
		time = sc.nextInt();
		interest = (principle*rate*time*1.0)/100;
		System.out.printf("The interest for the principle amount %.2f at the rate of %.2f for %d years is %.2f", principle, rate, time, interest);
		
	}
}
