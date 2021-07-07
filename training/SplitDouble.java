import java.util.Scanner;

class SplitDouble{
	/*
	 * Enter a double and split the whole number and fraction.
	 */
	public static void main(String args[]){
		double number, fraction;
		int whole_number;
		Scanner sc = new Scanner(System.in);
		number = sc.nextDouble();
		whole_number = (int) number;
		fraction = number - whole_number;
		System.out.printf("The whole value is %d and fraction is %f", whole_number, fraction);
	}
}
