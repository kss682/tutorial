
public class EmployeeDemo {
	public static void main(String args[]) {
		Employee emp = new Employee();
		emp = EmployeeData.storeData(emp);
		EmployeeData.showData(emp);
	}
}
