import java.util.Scanner;

public class Sequence_22_a{
	public static void main(String args[]){
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int odd_num=1, diff = 0;
		for(int i = 1; i <= n; i+=diff){
			System.out.printf("%d, ", i);
			diff += odd_num;
			odd_num += 2;
		}
	}
}
