import java.util.Scanner;

public class DecimalToBinary{
	public static void main(String args[]){
		int n, N;
		String binary = "";
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		n = N;
		while(n > 0){
			if(n%2 == 0){
				binary = "0" + binary;
			}
			else{
				binary = "1" + binary;
			}
			n = n/2;
		}
		System.out.printf("The binary of %d is %s", 2, binary);

	}
}
