import java.util.Scanner;

public class Pattern_32_a {
    public static void main(String args[]){
		int i, j, N;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		N = sc.nextInt();
		for(i = 1; i<= N; i++){
			for(j=1; j<=N; j++){
                if(j <= i){
                    System.out.printf("%d ", j);
                }
            }
            System.out.print("\n");
		}	
	}       
}
