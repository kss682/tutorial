import java.util.Scanner;

class MatrixTranspose{
	/*
	 *  Program to input a matrix and print its transpose.
	 */

	static void display(int[][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.printf("\n");
		}
	}
	
	static void transpose(int[][] arr1, int[][] arr2){
		int t_row, t_col;
		t_row = arr1[0].length;
		t_col = arr1.length;
		for(int i = 0; i<t_row; i++){
			for(int j=0; j<t_col; j++){
				arr2[i][j] = arr1[j][i];
			}
		} 	
	}
	
	public static void main(String args[]){
		int M, N;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		M = sc.nextInt();
		System.out.println("Enter number of columns:");
		N = sc.nextInt();

		int[][] matrix = new int[M][N];
		int[][] transpose = new int[N][M];
		System.out.println("Enter the matrix");
		for(int i=0; i< M; i++){
			System.out.printf("Enter row %d: ", i);
			for(int j=0; j<N; j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nDisplay the matrix:");
		display(matrix);
		transpose(matrix, transpose);
		System.out.println("\nDisplay the transpose matrix:");
		display(transpose);
	}
}
