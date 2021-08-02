import java.util.Scanner;

class Pattern_33_a{
	/*
	 * 	Pattern for N: 4
	 * 	1
	 * 	-4 9
	 * 	-16 25 -36
	 * 	49 -64 81 -100
	 */
	
	public static void main(String args[]){
		int N, i, j, k, flag = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		N = sc.nextInt();
		k = 1;
		for(i = 1; i<= N; i++){
			for(j = 1; j<=i; j++){
				System.out.printf("%d ", flag*k*k);
				flag *= -1;
				k++;
			}
			System.out.print("\n");
		}

		
	}
}
