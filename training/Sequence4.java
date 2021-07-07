import java.util.Scanner;

class Sequence4{
	/*
	 *	s1 = 1, s2 = 4, s3 = 7
	 *
	 */
	public static void main(String args[]){
		int N, s1= 1, s2 = 4, s3 = 7, temp1, temp2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		N = sc.nextInt();
		if(s1 <= N){
			System.out.printf("%d,", s1);
		}
		if(s2 <= N){
			System.out.printf("%d,", s2);
		}
		while(s3 <= N){
			System.out.printf("%d,", s3);
			temp1 = s2;
			temp2 = s3;
			s3 = s3 + s2 + s1;
			s2 = temp2;
			s1 = temp1;
		}
	}
}
