import java.util.Scanner;


class DigitToWord{

	private static String digitToWord(int num){
		String word = "";
		switch(num){
			case 0: word = " Zero";
				break;
			case 1: word = " One";
				break;
			case 2: word = " Two";
				break;
			case 3: word = " Three";
                                break;
			case 4: word = " Four";
                                break;
			case 5: word = " Five";
				break;
			case 6: word = " Six";
				break;
			case 7: word = " Seven";
				break;
			case 8: word = " Eight";
				break;
			case 9: word = " Nine";
				break;
		}
		return word;
	}

	public static void main(String args[]){
		int N, temp;
		String final_ans = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		N = sc.nextInt();
		while(N != 0){
			temp = N%10;
			final_ans = digitToWord(temp) + final_ans;
			N = N/10;
		}
		System.out.printf("%s", final_ans);
	}

}
