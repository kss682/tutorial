import java.util.Scanner;

class IdentityMatrix{
	/*
	 *  Input a square matrix and check if it a identity matrix
	 *	Identity matrix is a matrix with diagonal elements as 1 and all others 0.
	 */
	static Boolean checkIdentity(int[][] arr){
		for(int i=0; i< arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if(i == j && arr[i][j] != 1){
					return false;
				}
				else if(i != j && arr[i][j] != 0){
					return false;
				}
			}
		}	
		return true;
	}

	public static void main(String args[]){
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows and cols:");
		N = sc.nextInt();

		int[][] arr = new int[N][N];
		System.out.println("Enter the square matrix:");
		for(int i=0; i<N; i++){
			System.out.printf("Enter row %d: ", i);
			for(int j =0; j<N; j++){
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Display the matrix");
		for(int i =0; i<N; i++){
			for(int j=0; j<N; j++){
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.printf("\n");
		}

		if(checkIdentity(arr) == true){
			System.out.println("The matrix is an Identity matrix.");
		}
		else{
			System.out.println("The matrix is not an Identity matrix.");
		}
	}
}
