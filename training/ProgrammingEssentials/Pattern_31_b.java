import java.util.Scanner;

class Pattern_31_b{
	public static void main(String args[]){
		int i, j, N;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		N = sc.nextInt();
		for(i = 1; i<= N; i++){
			System.out.printf("%d%d%d%d%d\n\n", i,i,i,i,i);
		}	
	}
}
