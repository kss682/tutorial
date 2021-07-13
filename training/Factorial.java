import java.util.Scanner;

class Factorial{
	static long factorial(long n){
		if(n == 0){
			return 1;
		}
		if(n == 1){
			return 1;
		}
		else{
			return n*factorial(n-1);
		}
	}
	public static void main(String args[]){
		long num, fact;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = sc.nextLong();
		if(num >= 0){
			fact = factorial(num);
			System.out.printf("The factorial of %d is %d\n", num, fact);
		}
		else{
			System.out.println("The factorial of negative number is not possible");
		}
	}
}
