//Program to do side by side reflection
import java.util.Scanner; 

public class SidebySide {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = "";
        char[][] array = new char[5][5];
        int i,j;
        for(i = 0; i<5;i++){
            input = sc.nextLine();
            for(j = 4; j>=0; j--){
                array[i][4-j] = input.charAt(j);
            }
        }

        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                System.out.print(array[i][j]);
            }
            System.out.print("\n");
        }

    }
}
