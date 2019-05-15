package employeeInheritane;

public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager mgr = new Manager(126534,"Peter","ChennaiIndia",237844,65000.00);
		System.out.println("Manager details:");
		mgr.calculateSalary();
		mgr.calculateTransportAllowance();
		Trainee trn = new Trainee(29846,"Jack","MumbaiIndia",442085,45000.00);
		System.out.println("Trainee details:");
		trn.calculateSalary();
		trn.calculateTransportAllowance();
	}

}
