package employeeInheritane;

public class Manager extends Employee{

	Manager(long Id, String Name, String Address, long Phone,
			double salary) {
		super(Id, Name, Address, Phone);//Here you are sending the values to the parent class
		// TODO Auto-generated constructor stub
		
		this.basicSalary = salary;
		
	}
	
	public void calculateTransportAllowance() {
		double transportAllowance = (15.00/100.00)*basicSalary;
		System.out.println("Transportation Allowance is:"+transportAllowance);
	}
	
}
