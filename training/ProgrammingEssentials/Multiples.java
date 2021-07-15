
class Multiples{
	/*
	 * 	Display the 1st four multiples of 7 with reminder 1 when 
	 * 	divided by 2,3,4,5 and 6.
	 *
	 * 	LCM of 2,3,4,5,6 - 60
	 * 	so number of the form a = 60*q + 1 and 0=a mod 7
	 */
	public static void main(String args[]){
		long num,q = 1, count = 0;
		while(count < 4){
			num = 60*q + 1;
			if(num%7 == 0){
				System.out.printf("%d,", num);
				count++;
			}
			q++;
		}	
	}
}
