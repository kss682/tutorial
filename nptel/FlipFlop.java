import java.util.Scanner;

public class FlipFlop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[5][5];
        String input = "";
        int i, j;
        for(i=0; i<5; i++){
            input = sc.nextLine();
            for(j = 0; j<5; j++){
                // System.out.print(input.charAt(j));
                array[i][j] = (input.charAt(j) == '0') ? 1 : 0;
            }
        }
        for(i = 0; i < 5;i++){
            for(j =0;j<5;j++){
                System.out.print(array[i][j]);
            }
            System.out.print("\n");
        }
    
    }

}
