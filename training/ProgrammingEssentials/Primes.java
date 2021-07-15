import java.util.*;

class Primes{
	static List<Boolean> Primes = new ArrayList<Boolean>();

	static void seive(int num){
		int i, p = 2;
		for(i = 0; i <= num; i++){Primes.add(i, true);}
		while(p*p <= num){
			if(Primes.get(p) == true){
				for(i = 2*p; i <= num; i+=p){
					Primes.set(i, false);
				}	
			}
			p++;	
		}
	}

	public static void main(String args[]){
		int i, N, M, prime_sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower range:");
		N = sc.nextInt();
		System.out.println("Enter the higher range:");
		M = sc.nextInt();
		seive(M);
		System.out.printf("The primes in the range %d to %d are\n", N, M);
		for(i = N; i<=M;i++){
			if(Primes.get(i) == true){
				System.out.printf("%d \n", i);
				prime_sum += i;
			}
		}
		System.out.printf("The sum of primes is: %d", prime_sum);
	}
}
