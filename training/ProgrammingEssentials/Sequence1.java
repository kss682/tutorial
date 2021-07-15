import java.util.Scanner;

class Sequence1{
	public static void main(String args[]){
		int N, temp, i=2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		N = sc.nextInt();
		temp = i*i;
		while(temp <= N){
			System.out.printf("%d,",temp);
			i += 2;
			temp = i*i;
		}
	}
}
