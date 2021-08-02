import java.util.Scanner;

public class Sequence_22_c {
    public static void main(String args[]){
        int n, num = 1,i=0, diff1=1, diff2=2;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(num <= n){
            System.out.printf("%d, ", num);
            if(i%2 == 0){
                num += diff1;
                diff1++;
            }
            else{
                num += diff2;
                diff2--;
            }
            i++;
        }
    }
}
