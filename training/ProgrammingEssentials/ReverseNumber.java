import java.util.Scanner;

public class ReverseNumber{
	public static void main(String args[]){
		int n, rev_n = 0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while(n != 0){
			rev_n = rev_n*10 + n%10;
			n = n/10;
		}
		System.out.printf("The reverse number is %d", rev_n);
	}
}
