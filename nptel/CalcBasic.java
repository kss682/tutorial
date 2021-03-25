import java.util.Scanner;

public class CalcBasic{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output;
        
        // result = calc(input); 

    


        String[] temp;
        int op1, op2;
        int result = 0;
        if(input.indexOf("+") != -1){
            temp = input.split("\\+");
            op1 = Integer.parseInt(temp[0]);
            op2 = Integer.parseInt(temp[1]);
            result = (int)Math.round(op1+op2);
        }
        else if(input.indexOf('-') != -1){
            temp = input.split("\\-");
            op1 = Integer.parseInt(temp[0]);
            op2 = Integer.parseInt(temp[1]);
            result = (int)Math.round(op1-op2);
        }
        else if(input.indexOf('*') != -1){
            temp = input.split("\\*");
            op1 = Integer.parseInt(temp[0]);
            op2 = Integer.parseInt(temp[1]);
            result = (int)Math.round(op1*op2);
        }
        else if(input.indexOf('/') != -1){
            temp = input.split("\\/");
            op1 = Integer.parseInt(temp[0]);
            op2 = Integer.parseInt(temp[1]);
            result = (int)Math.round(op1/op2);
        }
        
        output = input + " = "  + Integer.toString(result); 
        System.out.println(output);
   
    }

}

