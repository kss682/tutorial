import java.util.Scanner;

public class ExponentPower {
    public static void main(String args[]){
        int n, X, power=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        X = sc.nextInt();
        System.out.println("Enter the exponent");
        n = sc.nextInt();
        for(int i=1; i<=n; i++){
            power *= X;
        }
        System.out.printf("The value of %d^%d is %d", X, n, power);
    }
}
