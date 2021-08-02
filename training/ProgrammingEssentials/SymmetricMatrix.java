import java.util.Scanner;

public class SymmetricMatrix {
    
    static boolean checkSymmetry(int[][] arr1, int[][] arr2){
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j<arr1[i].length; j++){
                if(arr1[i][j] != arr2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

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

        if(checkSymmetry(matrix, transpose)){
            System.out.println("The matrix is symmetric.");
        }
        else{
            System.out.println("The matrix is not symmetric.");
        }
    }
}
