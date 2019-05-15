package InterfaceAssignment;

public class KidUsers implements LibraryUser{

	int age;
	String bookType;
	
	
	public void requestBook() {
		if (bookType.equals("Kids")){
			System.out.println("Book issued successfully, please return the book within 10 days");
		}else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}

	public void registerAccount() {
		// TODO Auto-generated method stub
		
		if (age <=12) {
			System.out.println("You have successfully registered under a Kids account");
		}
		
	}

	
}
