import java.util.Scanner;
                                                                                                                                                            
class Sequence2{                                                                                                                                           
        public static void main(String args[]){                                                                                                            
                int N, temp, i=1;                                                                                                                           
                Scanner sc = new Scanner(System.in);                                                                                                        
                System.out.println("Enter the number: ");                                                                                                   
                N = sc.nextInt();                                                                                                                           
                temp = i;                                                                                                                                 
                while(temp <= N){                                                                                                                          
                        System.out.printf("%d,",temp);                                                                                                    
                        i += 1;                                                                                                                             
                        temp = i;                                                                                                                         
                }                                                                                                                                         
        }                                                                                                                                                   
}
