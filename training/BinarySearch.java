import java.util.Scanner;

class BinarySearch{
	static void sort(int[] arr){
		int i, j, len, min, temp;
		len = arr.length;
		for(i=0; i<len; i++){
			min = i;
			for(j=i+1; j<len; j++){
				if(arr[j] < arr[i]){
					min = j;
				}
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}

	}
	
	static void binarysearch(int[] arr, int num){
		int low = 0, high=arr.length, mid;

		while(low <= high){
			mid = (low+high)/2;
			if(arr[mid] > num){
				high = mid-1;
			}
			else if(arr[mid] < num){
				low = mid+1;
			}
			else if(arr[mid] == num){
				System.out.printf("%d is found in the array.", num);
				break;
			}
		}
	
		if(high < low){
			System.out.printf("%d is not found in the array.", num);
		}
	}

	
	public static void main(String args[]){
		int N, num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in array:");
		N = sc.nextInt();
		
		int[] arr = new int[N];
		System.out.println("Enter the elements of the array:");
		for(int i=0; i<N; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Display the array:");
		for(int i: arr){
			System.out.printf("%d ", i);
		}
		
		sort(arr);
		System.out.println("\nDisplay the sorted array:");
                for(int i: arr){
                        System.out.printf("%d ", i);
                }
		
		System.out.println("\nEnter the number to be searched:");
		num = sc.nextInt();
		binarysearch(arr, num);
		
	}
}
