package employeeInheritane;

public class Trainee extends Employee{

	Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone,
			double salary){
		super(employeeId, employeeName, employeeAddress, employeePhone);
		// TODO Auto-generated constructor stub
	
		this.basicSalary = salary;
	}
	

}
