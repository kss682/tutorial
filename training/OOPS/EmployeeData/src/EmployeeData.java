import java.util.Scanner;

public class EmployeeData {
	public static Employee storeData(Employee emp) {
		String empId, empName, addr1, addr2, city;
		int pin;
		Address addr = new Address();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Id");
		empId = sc.next();
		emp.setEmpId(empId);
		System.out.println("Enter the Employee Name");
		sc.nextLine();
		empName = sc.nextLine();
		emp.setEmpName(empName);

		System.out.println("Enter address 1");
		addr1 = sc.nextLine();
		System.out.println("Enter address 2");
		addr2 = sc.nextLine();
		System.out.println("Enter city name");
		city = sc.nextLine();
		System.out.println("Enter pin code");
		pin = sc.nextInt();

		addr.setAddr1(addr1);
		addr.setAddr2(addr2);
		addr.setCity(city);
		addr.setPin(pin);
		emp.setAddr(addr);

		return emp;
	}

	public static void showData(Employee emp) {
		System.out.printf("Employee ID: %s\n", emp.getEmpId());
		System.out.printf("Employee Name: %s\n", emp.getEmpName());
		System.out.printf("Employee address 1: %s\n", emp.getAddr().getAddr1());
		System.out.printf("Employee address 2: %s\n", emp.getAddr().getAddr2());
		System.out.printf("Employee city: %s\n", emp.getAddr().getCity());
		System.out.printf("Employee Pin: %d\n", emp.getAddr().getPin());
	}
}
