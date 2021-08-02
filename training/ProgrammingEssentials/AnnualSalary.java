import java.util.Scanner;

class AnnualSalary{
	/*
	 *  annual_salary = (basic + special_allowances)*12
	 *  gross_annual_salary = annual_salary + bonus 
	 *  if tax_saving_investment then tax reduction upto 1.5 lakh
	 *  net_annual_salary = gross_annual_salary - tax_rate*(gross_annual_salary - tax_saving_investment)
	 * 
	 */
	
	public static void main(String args[]){
		String name;
		long empId;
		double basic_salary, spl_allowances, bonus, annual_salary,gross_annual_salary, net_annual_salary, tax_saving_investment, tax_payable;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the employee name:");
		name = sc.next();
		System.out.println("\nEnter the employee ID:");
		empId = sc.nextLong();
		System.out.println("\nEnter the basic salary:");
		basic_salary = sc.nextDouble();
		System.out.println("\nEnter the special allowances:");
		spl_allowances = sc.nextDouble();
		System.out.println("\nEnter the bonus rate:");
		bonus = sc.nextDouble();
		System.out.println("\nEnter the tax saving investment(0 if nothing)");
		tax_saving_investment = sc.nextDouble();
		if(tax_saving_investment >= 150000){
			tax_saving_investment = 150000;
		}
		
		annual_salary = (basic_salary+spl_allowances)*12;
		gross_annual_salary = annual_salary + (annual_salary*bonus*1.0)/100;
		
		double tax_payable_salary = gross_annual_salary - tax_saving_investment;
		if(tax_payable_salary <= 250000){
			tax_payable = 0;
		}
		else if(tax_payable_salary <= 500000){
			tax_payable = ((tax_payable_salary - 250000)*5)/100;
		}
		else if(tax_payable_salary <= 1000000){
			tax_payable = 12500 + ((tax_payable_salary - 500000)*20)/100;
		}
		else{
			tax_payable = 12500 + 100000 + ((tax_payable_salary - 1000000)*30)/100;
		}
		net_annual_salary = gross_annual_salary - tax_payable;
		System.out.printf("\nAnnual gross salary: %.2f", gross_annual_salary);
		System.out.printf("\nAnnual net salary: %.2f", net_annual_salary);
		System.out.printf("\nTax payable: %.2f", tax_payable);
	}
}
