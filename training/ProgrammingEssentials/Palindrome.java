import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        String str;
        boolean flg = true;
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                flg = false;
                break;
            }
        }
        if(flg){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
