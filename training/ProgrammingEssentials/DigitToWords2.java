import java.util.Scanner;

public class DigitToWords2 {
    /*
        To represent number 1203 as One Thousand Two Hundred Three Only.
    */
    public static void main(String args[]){
        String TENS[] = {
           "Zero", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
        };
        String UNITS[] = {
            "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
        };
        String EXTRA[] = {
            "Hundred", "Thousand", "Lakh", "Crore"
        };
        
        String number;
        StringBuilder rev = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        
        number = sc.next();
        rev.append(number);
        rev.reverse();
        
        String ans = "";
        for(int i = 0; i < rev.length(); i++){
            if(i >= 2){
                if(i == 2 && Character.getNumericValue(rev.charAt(i)) != 0){
                    ans = "Hundred and" + " " + ans;
                }
                else if(i == 3){
                    ans = "Thousand" + " " + ans;
                }
                else if(i == 5){
                    ans = "Lakh" + " " + ans;
                }
                else if(i == 7){
                    ans = "Crore" + " " + ans;
                }
                if(i%2 != 0 || i == 2){
                    ans = Character.getNumericValue(rev.charAt(i)) != 0 ? UNITS[Character.getNumericValue(rev.charAt(i))] + " " + ans : ans;
                }
                else{
                    ans = Character.getNumericValue(rev.charAt(i)) != 0 ? TENS[Character.getNumericValue(rev.charAt(i))] +  " " + ans : ans;
                }
            }
            else if(i == 0){
                ans = Character.getNumericValue(rev.charAt(i)) != 0 ? UNITS[Character.getNumericValue(rev.charAt(i))] + " " + ans : ans;
            }
            else if(i == 1){
                ans = Character.getNumericValue(rev.charAt(i)) != 0 ? TENS[Character.getNumericValue(rev.charAt(i))] +  " " + ans : ans;
            }
        }
    
        System.out.printf("The number in words is %s", ans);
    }
}
