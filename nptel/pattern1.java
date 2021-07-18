import java.util.*;

class pattern1{
    public static void main(String args[]){
        int n, i, j, counter = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int flag = 0;
        int mid_point = (n*n)/2;
        for(i=1; i<=n; i++){
            j =1;
            flag = 0;
            while(j<=n*n){
                  if(j > mid_point - i && j < mid_point + i){
                       if(flag == 0){
                            System.out.print("*");
                            j += 1;
                            flag = 1;
                            }
                       else{
                           flag = 0;
                           System.out.print(" ");
                       }
                    
                  }
                  else {
                    System.out.print(" ");
                    j += 1;
                  }
            }
            System.out.print("\n");
        }
    }

}

/*
n = 3
mp = 2

for i in n:
    mid = 2
    for j in n:
     * * * * * * *
         *    
       * * * 
        
        
    
    
*/
