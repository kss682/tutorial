import java.util.Scanner;

class StudentMarks{

	private static void getGrade(double mark, String subject){
		if(mark >= 60){
			System.out.printf("The grade for %s: First Class\n", subject);
		}
		else if(mark >= 50){
			System.out.printf("The grade for %s: Second Class\n", subject);
		}
		else if(mark >= 35){
			System.out.printf("The grade for %s: Pass Class\n", subject);
		}
		else{
			System.out.printf("The grade for %s: Fail\n", subject);
		}
	}

	public static void main(String args[]){
		String name;
		double mark1, mark2, mark3, total, avg_mark, first, second;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student name:");
		name = sc.next();
		System.out.println("Enter the mark for subject1(out of 100):");
		mark1 = sc.nextDouble();
		System.out.println("Enter the mark for subject2(out of 100):");
		mark2 = sc.nextDouble();
		System.out.println("Enter the mark for subject3(out of 100):");
		mark3 = sc.nextDouble();

		total = mark1 + mark2 + mark3;
		avg_mark = (total*1.0)/3;
		first = mark1 > mark2 ? mark1 > mark3 ? mark1 : mark3 : mark2 > mark3 ? mark2 : mark3;
		second = first == mark1 ? mark2 > mark3 ? mark2 : mark3 : first == mark2 ? mark1 > mark3 ? mark1 : mark3 : mark1 > mark2 ? mark1 : mark2; 
		System.out.printf("The highest mark obtained by %s is %.1f\n", name, first);
		System.out.printf("The second highest mark obtained by %s is %.1f\n", name, second);
		System.out.printf("The average mark for 3 subjects: %.1f\n", avg_mark);
		System.out.printf("The total mark for 3 subjects(out of 300):%.1f\n", total);
	
		System.out.println("Report Card");
		getGrade(mark1, "Subject1");
		getGrade(mark2, "Subject2");
		getGrade(mark3, "Subject3");
		getGrade(avg_mark, "All Subjects");
					
	}
}
