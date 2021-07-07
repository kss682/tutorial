import java.util.Scanner;

class SwapNumbers{
	/*
	 * Program to swap 2 numbers
	 */
	public static void main(String args[]){
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 numbers a and b:");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.printf("Before swapping: a=%d and b=%d\n", a, b);
		a = a+b;
		b = a-b;
		a = a-b;
	       System.out.printf("After swapping: a=%d and b=%d\n", a, b);	
	}
}
