package employeeInheritane;

public class Employee {
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra=1000.50;
	
	Employee(long Id,String Name,String Address,Long Phone)
	{
		this.employeeId = Id;
		this.employeeName = Name;
		this.employeeAddress = Address;
		this.employeePhone = Phone;
	}
	
	//method to calculate salary
	public void calculateSalary() {
		double salary;
		salary = basicSalary+(basicSalary*(specialAllowance/100)) + 
				(basicSalary*(hra/100));
		System.out.println("Salary is:"+salary);
	}
	
	public void calculateTransportAllowance() {
		double transportAllowance = (10.00/100.00)*basicSalary;
		System.out.println("Transportation Allowance is:"+transportAllowance);
	}

}
