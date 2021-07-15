import java.util.Scanner;

class EvenOdd{
	/*
	 *	Check if a number is even or odd
	 */
	public static void main(String args[]){
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		number = sc.nextInt();
		String even_odd = number%2 == 0 ? "even" : "odd";
		System.out.printf("%d is %s", number, even_odd);
	}
}
