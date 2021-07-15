import java.util.Scanner;

public class RectangleDemo {
	public static void main(String args[]) {
		double length, breadth, area; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle.");
		length = sc.nextDouble();
		System.out.println("Enter the breadth of the rectangle.");
		breadth = sc.nextDouble();
		
		Rectangle rect = new Rectangle(length, breadth);
		area = rect.area();
		System.out.printf("The area of rectangle is %.2f sq units.", area);
	}
}
