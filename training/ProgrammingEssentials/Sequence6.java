import java.util.Scanner;

class Sequence6{
	public static void main(String args[]){
		int N, i = 1, j =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		N = sc.nextInt();
		while(i <= N){
			System.out.printf("%d,", i);
			i = i + j*4;
			j++;
			if(j%3 == 0){j++;}
		}
	}
}
