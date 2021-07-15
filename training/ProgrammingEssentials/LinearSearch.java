import java.util.Scanner;

class LinearSearch{
	public static void main(String args[]){
		int N, num;
		Boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in array:");
		N = sc.nextInt();
		int[] arr = new int[N];
		System.out.println("Enter the elements of array:");
		for(int i = 0; i<N; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Display the array:");
		for(int i: arr){
			System.out.printf("%d ", i);
		}

		System.out.println("\nEnter the number to be searched:");
		num = sc.nextInt();
		for(int i: arr){
			if(i == num){
				flag =true;
				break;
			}
		}
		if(flag == true){
			System.out.printf("%d is found in array.", num); 
		}
		else{
			System.out.printf("%d is not found in array.", num);
		}
	}
}
