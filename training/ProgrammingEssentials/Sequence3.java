import java.util.Scanner;
import java.lang.Math;

class Sequence3{
	public static void main(String args[]){
		int N, temp, i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		N = sc.nextInt();
		temp = 1;
		while(temp <= N){
			System.out.printf("%d,",temp);
			i += 1;
			temp = (int)Math.pow(i,i);
		}
	}
}
