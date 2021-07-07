
class Eval{
	public static void main(String args[]){
		int a=2, b=2, c=1, d=3, e=10;
		double ans;
		System.out.printf("The values of of a=%d,b=%d,c=%d,d=%d,e=%d\n", a, b, c, d, e);
		ans = a + b - c*(d*1.0)/e;
		System.out.printf("a+b-c*d/e = %.2f", ans);
	}
}
