import java.util.Scanner;

public class LCM {
    public static  int gcd(int a, int b) {
        if(a == 0) {return b;}
        return gcd(b%a, a);
    }

    public static void main(String args[]){
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        num1 = sc.nextInt();
        System.out.println("Enter num2");
        num2 = sc.nextInt();

        int lcm, gcd;
        gcd = num1 > num2 ? gcd(num1, num2): gcd(num2, num1);
        lcm = (num1*num2)/gcd;
        System.out.printf("LCM of %d and %d is %d", num1, num2, lcm);
    }
}
