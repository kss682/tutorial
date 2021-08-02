import java.util.Scanner;

public class LCMArray {
    public static int gcd(int a, int b){
        if(a == 0) {
            return b;
        }
        return gcd(b%a, a);
    }

    public static int lcm(int num1, int num2){
        int gcd = num1 > num2 ? gcd(num1, num2): gcd(num2, num1);
        return (num1*num2)/gcd;
    }
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();

        System.out.println("Enter the array numbers");
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int lcm;
        lcm = lcm(arr[0], arr[1]);
        for(int i=2; i<arr.length; i++){
            lcm = lcm(lcm, arr[i]);
        }
        System.out.printf("The lcm is %d", lcm);
    }
}
