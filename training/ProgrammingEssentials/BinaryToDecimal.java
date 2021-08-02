import java.util.Scanner;
import java.lang.Math;

public class BinaryToDecimal {
    public static void main(String args[]){
        int n = 0;
        String binary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary value");
        binary = sc.next();
        for(int i = binary.length() -1; i >= 0; i--){
            n = n + (int) Math.pow(2, binary.length() - 1 - i)*Character.getNumericValue(binary.charAt(i));
        }
        System.out.printf("The decimal of %s is %d", binary, n);
    }
}
