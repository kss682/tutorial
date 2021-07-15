import java.util.Scanner;
import java.lang.Math;

class Sequence5{
	public static void main(String args[]){
		int N, i, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		N = sc.nextInt();
		i = 1;
		temp = (int) Math.pow(i, 2);
		while(temp <= N){
			System.out.printf("%d,", temp);
			i++;
			if(i%4 ==0){
				i++;
			}
			temp = (int) Math.pow(i, 2);
		}
	}
}
