package InterfaceAssignment;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KidUsers kidusers = new KidUsers();
		kidusers.age = 10;
		kidusers.bookType = "Kids";
		kidusers.registerAccount();
		kidusers.requestBook();
		kidusers.age = 18;
		kidusers.bookType = "Fiction";
		
		kidusers.registerAccount();
		kidusers.requestBook();
		
		AdultUser adultuser = new AdultUser();
		adultuser.age = 5;
		adultuser.bookType = "Kids";
		adultuser.registerAccount();
		adultuser.requestBook();
		adultuser.age = 23;
		adultuser.bookType = "Fiction";
		
		adultuser.registerAccount();
		adultuser.requestBook();
		
		
		

	}

}
