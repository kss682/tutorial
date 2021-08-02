import java.util.Scanner;

public class Pattern_32_c {
    public static void main(String args[]){
		int i, j, N;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		N = sc.nextInt();
        int k = 1;
        for(i = 1; i<= N; i++){
			for(j=1; j<=N; j++){
                if(j <= i){
                    System.out.printf("%d ", k);
                    k++;   
                }
            }
            System.out.print("\n");
		}	
	}   
}
