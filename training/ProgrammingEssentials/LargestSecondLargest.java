import java.util.Scanner;

public class LargestSecondLargest{
	public static void main(String args[]){
		int a, b, c, largest, sec_largest;
		System.out.println("Enter the three numbers : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		largest = a > b ? a > c ? a : c : b > c ? b : c;
	       	sec_largest = a > b ? (a < largest ? a : (b > c ? b : c)): (b < largest ? b : (a > c ? a : c));
		System.out.printf("The largest number is %d\n", largest);	
		System.out.printf("The second largest number is %d\n", sec_largest);
	}
}
