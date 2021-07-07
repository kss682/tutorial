import java.util.Scanner;

class Vendors{
	/*
	 *	client_cost = hours*rate + (resource_cost*resource_type)/100
	 *	vendor_cost = software/hardware_cost + third_party_rate*hours
	 *	
	 *	resource_type - Hardware - client pays 30%
	 *			Commonly used - client pays 50%
	 *		      - Proprietory - client pays 100%
	 *	
	 *	profit/loss = (client_cost - vendor_cost)*100/vendor_cost
	 */
	public static void main(String args[]){
		double client_cost, vendor_cost, vendor_rate, vendor_time, resource_cost, thrd_pty_rate, thrd_pty_time;
		String resource_type = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vendor rate(per hour):");
		vendor_rate = sc.nextDouble();
		System.out.println("Enter the time taken by vendor to complete(in hours):");
		vendor_time = sc.nextDouble();
		System.out.println("Enter the resource type bought (Hardware or Common Software or Proprietory Software):");
		sc.nextLine();
		resource_type = sc.nextLine();
		System.out.println("Enter the cost of the resource:");
		resource_cost = sc.nextDouble();
		System.out.println("Enter the third party service rate:");
		thrd_pty_rate = sc.nextDouble();
		System.out.println("Enter amount of time third party service is used (in hours):");
		thrd_pty_time = sc.nextDouble();
		
		vendor_cost = resource_cost + thrd_pty_rate*thrd_pty_time;
		//System.out.printf("Resource cost: %.2f\n", resource_cost);
		System.out.printf("Vendor cost: %.2f\n", vendor_cost);
		if(resource_type.equals("Common Software")){
			resource_cost = (resource_cost*1.0)/2;
		}
		else if(resource_type.equals("Hardware")){
			resource_cost = (resource_cost*1.0)/3;
		}
		client_cost = vendor_rate*vendor_time + resource_cost;
		//System.out.printf("Resource cost: %.2f\n", resource_cost);
		System.out.printf("client cost: %.2f\n", client_cost);
		double net = ((client_cost - vendor_cost)*100.00)/vendor_cost;
		if(net == 0){
			System.out.println("The vendor incurred neither profit or loss.");
		}
		else if(net > 0){
			System.out.printf("The vendor incurred a profit of %.2f", net);
		}
		else{
			net = net*-1;
			System.out.printf("The vendor incurred a loss of %.2f", net);
		}
	}
	
}
