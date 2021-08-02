import java.util.Scanner;

public class OddSum{
	public static void main(String args[]){
		int n, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n:");
		n = sc.nextInt();
		for(int i =1; i<=n; i+=2){
			sum += i;
		}
		System.out.printf("The sum of odd numbers till %d is %d", n, sum);
	}
}
