import java.util.Scanner;

public class CheckFibonacci {
public static void main(String args[]){
	int n, first = 1, second = 0, temp;
	boolean flg = false;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	n = sc.nextInt();
	while(second <= n){
		System.out.printf("%d->", second);
		if(second == n){
			System.out.printf("%d is in fibonacci series\n", n);
			flg = true;
			break;
		}
		temp = first;
		first = first + second;
		second = temp;
	}
	if(!flg){
		System.out.printf("%d is not in fibonacci series\n", n); 
	}

}
}


