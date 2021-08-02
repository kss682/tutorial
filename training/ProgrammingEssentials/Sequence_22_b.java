import java.util.Scanner;

public class Sequence_22_b {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");   
        n = sc.nextInt();
        int temp, first = 1, second = 1;
        if(n >= 1){
            System.out.print("1,");
        }
        while(first <= n){
            System.out.printf("%d, ", first);
            temp = first;
            first = first + second;
            second = temp;
        }   
    }
}
