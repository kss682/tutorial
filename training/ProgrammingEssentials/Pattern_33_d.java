import java.util.Scanner;

class Pattern_33_d{
	/*
	 *  Program to print the pattern :
	 *  		  *
	 *  	 	* * *
	 */
	public static void main(String args[]){
		int i, j, k, N;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		N = sc.nextInt();
		k = N;
		for(i=1; i<=N; i++){
			for(j=1; j<=2*N-1; j++){
				if(j < k+i && j > k-i){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}
