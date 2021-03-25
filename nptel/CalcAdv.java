import java.util.Scanner;

public class CalcAdv {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i;
        String input = "";
        String temp = "";
        input = sc.nextLine();
        for(i = 0; i < input.length(); i++){
            temp = temp + gui_map(input.charAt(i));
        }
        // System.out.print(temp);
        String[] temp_arr;
        int op1, op2;
        double result = 0;
        if(temp.indexOf('+') != -1){
            temp_arr = temp.split("[+=]");
            op1 = Integer.parseInt(temp_arr[0]);
            op2 = Integer.parseInt(temp_arr[1]);
            result = Math.round(op1+op2);
        }
        else if(temp.indexOf('-') != -1){
            temp_arr = temp.split("[-=]");
            op1 = Integer.parseInt(temp_arr[0]);
            op2 = Integer.parseInt(temp_arr[1]);
            result = Math.round(op1-op2);
        }
        else if(temp.indexOf('X') != -1){
            temp_arr = temp.split("[X=]");
            op1 = Integer.parseInt(temp_arr[0]);
            op2 = Integer.parseInt(temp_arr[1]);
            result = Math.round(op1*op2);
        }
        else if(temp.indexOf('+') != -1){
            temp_arr = temp.split("[/=]");
            op1 = Integer.parseInt(temp_arr[0]);
            op2 = Integer.parseInt(temp_arr[1]);
            result = Math.round(op1/op2);
        }
        System.out.print(result);
    }
    
    static char gui_map(char in){
		char out = 'N';// N = Null/Empty
		char gm[][]={{'a','.'}
					,{'b','0'}
					,{'c','='}
					,{'d','+'}
					,{'e','1'}
					,{'f','2'}
					,{'g','3'}
					,{'h','-'}
					,{'i','4'}
					,{'j','5'}
					,{'k','6'}
					,{'l','X'}
					,{'m','7'}
					,{'n','8'}
					,{'o','9'}
					,{'p','/'}};
					
		// Checking for maps
		for(int i=0; i<gm.length; i++){
			if(gm[i][0]==in){
				out=gm[i][1];
				break;
			}
		}
		return out;
	}
}
