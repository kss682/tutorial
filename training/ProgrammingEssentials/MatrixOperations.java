import java.util.Scanner;

public class MatrixOperations {

    static void display(int[][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.printf("\n");
		}
	}

    public static void add(int[][] arr1, int[][] arr2, int[][] arr3){
        for(int i =0; i < arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
    }

    public static void sub(int[][] arr1, int[][] arr2, int[][] arr3){
        for(int i =0; i < arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                arr3[i][j] = arr1[i][j] - arr2[i][j];
            }
        }
    }

    public static void mul(int[][] arr1, int[][] arr2, int[][] arr3){
        for(int i =0; i < arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                arr3[i][j] = arr1[i][j]*arr2[i][j];
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

        int[][] matrix1 = new int[M][N];
        int[][] matrix2 = new int[M][N];
        int[][] addMatrix = new int[M][N];
        int[][] subMatrix = new int[M][N];
        int[][] mulMatrix = new int[M][N];

        System.out.println("Enter the first matrix");
		for(int i=0; i< M; i++){
			System.out.printf("Enter row %d: ", i);
			for(int j=0; j<N; j++){
				matrix1[i][j] = sc.nextInt();
			}
		}

        System.out.println("Enter the second matrix");
		for(int i=0; i< M; i++){
			System.out.printf("Enter row %d: ", i);
			for(int j=0; j<N; j++){
				matrix2[i][j] = sc.nextInt();
			}
		}
    
        add(matrix1, matrix2, addMatrix);
        sub(matrix1, matrix2, subMatrix);
        mul(matrix1, matrix2, mulMatrix);

        System.out.println("--------Add Matrix---------");
        display(addMatrix);
        System.out.println("--------Sub Matrix---------");
        display(subMatrix);
        System.out.println("--------Mul Matrix---------");
        display(mulMatrix);
    }
}
